package com.twitter.twitter.service;

import com.twitter.twitter.dto.SignUpDTO;
import com.twitter.twitter.entity.Account;
import com.twitter.twitter.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {

    @Autowired
    private AccountRepository accountRepository;

    public void signup(SignUpDTO signUpDTO){
        //1. Ngecek Username udah exists
        Optional<Account> existingAccount = accountRepository.findByUsername(signUpDTO.getUsername());
        if(existingAccount.isPresent()){
           throw new RuntimeException();
        }
        //2. Save Repository
        accountRepository.save(new Account().setPassword(signUpDTO.getPassword())
                .setUsername(signUpDTO.getUsername())
        );
    }

    //ToDo Sign In

    //ToDo Sign out
}
