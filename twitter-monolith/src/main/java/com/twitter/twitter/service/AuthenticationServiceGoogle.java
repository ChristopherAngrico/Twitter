package com.twitter.twitter.service;

/**
 * @author Michael Wijaya
 * @version $Id: AuthenticationServiceGoogle.java, v0.1 Aug 01, 2021 1:46 PM Michael Wijaya Exp $
 */

public class AuthenticationServiceGoogle extends BaseService implements AuthenticationService {

    @Autowired
    private GoogleService googleService;

    public boolean login (AuthenticationRequest authenticationRequest){
        super.login(authenticationRequest);
        GoogleLoginResponse googleLoginResponse = googleService.login(new GoogleLoginRequest());

        return googleLoginResponse.isSuccess();

    }

    @Override
    public void defaultFunction() {
        super.defaultFunction();
        System.out.println("This is google service");
    }
}
