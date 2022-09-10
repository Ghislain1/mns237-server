package org.mns237.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import java.util.List;
import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private DataSource dataSource;

	@Value("${spring.queries.users-query}")
	private String usersQuery;

	@Value("${spring.queries.roles-query}")
	private String rolesQuery;

	public SecurityConfiguration(BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	protected void configure (AuthenticationManagerBuilder auth)
	throws Exception {
		auth.
				jdbcAuthentication()
		.usersByUsernameQuery(usersQuery)
		.authoritiesByUsernameQuery(rolesQuery)
		.dataSource(dataSource)
		.passwordEncoder(bCryptPasswordEncoder);
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception{

		// To avoid CORS policy from Front end
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type"));
		corsConfiguration.addAllowedOriginPattern("*");
		//corsConfiguration.addAllowedHeader("*");
		corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PUT", "OPTIONS", "PATCH", "DELETE"));
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setExposedHeaders(List.of("Authorization"));

		httpSecurity.
			authorizeRequests()
			.antMatchers("/api").permitAll()
			.antMatchers("/api/blogs").permitAll()
			.antMatchers("/api/video/list").permitAll()
			.antMatchers("/contact").permitAll()
			.antMatchers("/media").permitAll()
			.antMatchers("/api/list/abonnement").permitAll()
			//.antMatchers("/api/home").permitAll()
			.antMatchers("/api/users").permitAll()
			.antMatchers("/api/totalUser").permitAll()
			.antMatchers("/api/products").permitAll()
			.antMatchers("/api/comments").permitAll()
			.antMatchers("/api/register").permitAll()
			.antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
			.authenticated().and().csrf().disable().cors().configurationSource(request -> corsConfiguration).and().formLogin()
			.loginPage("/").failureUrl("/login?error=true")
			.defaultSuccessUrl("/admin/dashboard")
			.usernameParameter("username")
			.passwordParameter("password")
			.and().logout();

	}

	@Override
	public void configure(WebSecurity web) throws Exception{
		web
			.ignoring()
			.antMatchers("/");
	}

}
