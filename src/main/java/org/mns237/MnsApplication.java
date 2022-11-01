package org.mns237;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.mns237")

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableJpaRepositories("com.example.repository")
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableJpaRepositories(basePackageClasses ={ EntityManagerFactory.class, EmployeeRepository.class})
@ComponentScan(basePackages = "org.mns237.dao")
// @ComponentScan(basePackageClasses= {EmployeeController.class, EmployeeRepository.class})
//@EnableJpaRepositories(basePackageClasses={EmployeeRepository.class} )  // <== entityManagerFactory error
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // <== Error on repository
@SpringBootApplication
public class MnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MnsApplication.class, args);
	}

}
