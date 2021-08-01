package com.twitter.twitter.service;

/**
 * @author Michael Wijaya
 * @version $Id: GoogleService.java, v0.1 Aug 01, 2021 1:47 PM Michael Wijaya Exp $
 */
public interface GoogleService {


     GoogleLoginResponse login(GoogleLoginRequest request);
}
