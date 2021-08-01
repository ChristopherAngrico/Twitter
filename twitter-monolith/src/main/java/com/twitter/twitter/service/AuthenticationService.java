package com.twitter.twitter.service;

/**
 * @author Michael Wijaya
 * @version $Id: AuthenticationService.java, v0.1 Aug 01, 2021 1:37 PM Michael Wijaya Exp $
 */
public interface AuthenticationService {

    /**
     * This endpoint is for login
     * @return
     */
    boolean login(AuthenticationRequest authenticationRequest);


    boolean logout();


    void defaultFunction();
}
