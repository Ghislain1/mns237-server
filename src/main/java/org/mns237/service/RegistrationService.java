package org.mns237.service;


import org.mns237.controller.RegistrationRequest;
import org.mns237.entity.AppUser;
import org.mns237.entity.AppUserRole;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValideEmail = emailValidator.test(request.getEmail());
        if(!isValideEmail){
            throw new IllegalStateException("Email Not valide");
        }

        return appUserService.signUpUser(
            new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getPassword(),
                request.getEmail(),
                AppUserRole.USER
            )
        );
    }
    
}
