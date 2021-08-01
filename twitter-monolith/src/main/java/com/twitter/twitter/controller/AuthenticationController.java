package com.twitter.twitter.controller;

import com.twitter.twitter.service.AuthenticationService;

/**
 * @author Michael Wijaya
 * @version $Id: AuthenticationController.java, v0.1 Aug 01, 2021 1:41 PM Michael Wijaya Exp $
 */
@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMappping("/login")
    public boolean login(@RequestBody AuthenticationRequest request){

        return authenticationService.login(request);
    }
}
