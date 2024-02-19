package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidusername = username.equalsIgnoreCase("mazin");
        boolean isValidpassword = password.equalsIgnoreCase("dummy");

        return isValidusername && isValidpassword;
    }
}
