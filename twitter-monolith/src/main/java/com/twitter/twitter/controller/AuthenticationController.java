package com.twitter.twitter.controller;

import com.twitter.twitter.dto.SignUpDTO;
import com.twitter.twitter.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/authentication")
@Slf4j
public class AuthenticationController {

    //IOC -> Inversion Of Control
    @Autowired
    private AuthenticationService service;

    @PostMapping
    public void signup(@RequestBody SignUpDTO signUpDTO){
        log.info("Sign up : {}", signUpDTO);
        service.signup(signUpDTO);
        //ToDo disini markingnya itu habis sign up langsung ter-signin
    }

    //ToDo Sign In

    //ToDo Sign Out
}
