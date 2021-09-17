package com.twitter.twitter.controller;

import com.twitter.twitter.dto.SignInDTO;
import com.twitter.twitter.dto.SignOutDTO;
import com.twitter.twitter.dto.SignUpDTO;
import com.twitter.twitter.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/authentication")
@Slf4j
public class AuthenticationController {

    //IOC -> Inversion Of Control
    @Autowired
    private AuthenticationService service;

    @PostMapping("/sign-up")
    public void signup(@RequestBody SignUpDTO signUpDTO) {
        log.info("Sign Up : {}", signUpDTO);
        service.signup(signUpDTO);
        //ToDo disini markingnya itu habis sign up langsung ter-signin
    }

    //ToDo Sign In
    @PostMapping("/sign-in")
    public void signin(@RequestBody SignInDTO signInDTO) {
        log.info("Sign In : {}", signInDTO);
        service.signin(signInDTO);
        //ToDo disini markingnya itu habis sign up langsung ter-signin
    }

    //ToDo Sign Out
    @PostMapping("/sign-out")
    public void signout(@RequestBody SignOutDTO signOutDTO) {
        log.info("Sign Out : {}", signOutDTO);
        service.signout(signOutDTO);
        //ToDo disini markingnya itu habis sign up langsung ter-signin
    }
}
