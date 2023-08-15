package org.mns237.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.mns237.dao.AppUserRepository;
import org.mns237.dto.ConfirmationToken;
import org.mns237.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {
    private final String USER_NOT_FOUND = "User with email %s does not exist!!";
    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ConfirmationTokenService confirmationTokenService;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        return appUserRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND, email)));
    }

    public String signUpUser(AppUser appUser){
        // checking if user exist
        boolean userExist = appUserRepository.findByEmail(appUser.getEmail()).isPresent();
        if(userExist){
            throw new IllegalStateException(" Email already taken" + appUser.getEmail());
        }
        String encodPassword = bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(encodPassword);
        boolean passExist = appUserRepository.findByPassword(appUser.getPassword()).isPresent();
        if(passExist){
            throw new IllegalStateException(" Password already taken" + appUser.getPassword());
        }
        appUserRepository.save(appUser);
        
        String  token = UUID.randomUUID().toString();
        ConfirmationToken confirmationToken = new ConfirmationToken(
            token,
            LocalDateTime.now(),
            LocalDateTime.now().plusMinutes(15),
            appUser  
        );
        confirmationTokenService.saveConfirmationToken(confirmationToken);

        return token;
    }

    public int enableAppUser(String email) {
        return appUserRepository.enableAppUser(email);
    }
    
}
