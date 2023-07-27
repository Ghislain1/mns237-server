package org.mns237.entity;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
//import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AppUser implements UserDetails {
    
    // @SequenceGenerator(
    //     name = "student_sequence",
    //     sequenceName = "student_sequence",
    //     allocationSize = 1
    // )
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message ="*please provide an email")
    private String email;
    @Length(min = 6, message = "*Your password must be atleast 6 characters")
    @NotEmpty(message = "*please provide a password")
    @Column(name="password")
    private String password;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;
    private Boolean enabled = true;
    private Boolean locked = false;
    
    public AppUser(String password, String firstName, String lastName, String email, AppUserRole appUserRole){
        this.email = email;
        this.password = password;
        this.appUserRole = appUserRole;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(appUserRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    
}
