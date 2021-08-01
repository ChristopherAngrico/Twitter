package com.twitter.twitter.service;

/**
 * @author Michael Wijaya
 * @version $Id: BaseService.java, v0.1 Aug 01, 2021 1:37 PM Michael Wijaya Exp $
 */
public abstract class BaseService {


    public boolean login(AuthenticationRequest authenticationRequest){
        validate(authenticationRequest);
        return true;
    }
    private void validate(AuthenticationRequest authenticationRequest){

        //ToDo insert validation logic
    }

    public void defaultFunction(){
        System.out.println("This is default function");
    }
}
