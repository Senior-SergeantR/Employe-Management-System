package com.java.EmployeeMangement.Service;

import com.java.EmployeeMangement.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.java.EmployeeMangement.Model.UserEntity;

public interface UserService extends UserDetailsService {
    UserEntity save(UserRegistrationDto registrationDto);

}
