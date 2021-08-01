package com.twitter.twitter.service;

/**
 * @author Michael Wijaya
 * @version $Id: AuthenticationServiceImpl.java, v0.1 Aug 01, 2021 1:38 PM Michael Wijaya Exp $
 */
public class AuthenticationServiceDatabase extends BaseService implements AuthenticationService {

//    @Autowired
//    private UserRepository userRepository;

    public boolean login(AuthenticationRequest authenticationRequest) {
        super.login(authenticationRequest);
        User user = userRepository.findByUsernameAndPassword(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        if(user == null){
            return false;
        }

        return true;
    }

    public boolean logout() {
        return false;
    }
}
