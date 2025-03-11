package com.java.EmployeeMangement;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.java.EmployeeMangement.UserRegistrationDto;
import com.java.EmployeeMangement.UserEntity;

public interface UserService extends UserDetailsService {
    UserEntity save(UserRegistrationDto registrationDto);

}
