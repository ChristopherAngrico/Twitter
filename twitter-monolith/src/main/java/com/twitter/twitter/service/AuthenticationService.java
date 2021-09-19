package com.twitter.twitter.service;

import com.twitter.twitter.dto.SignInDTO;
import com.twitter.twitter.dto.SignOutDTO;
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

    public void signup(SignUpDTO signUpDTO) {
        //1. Ngecek Username udah exists
        Optional<Account> existingAccount = accountRepository.findByUsername(signUpDTO.getUsername()); //Ini bagian query
        if (existingAccount.isPresent()) {
            throw new RuntimeException();
        }
        //2. Save Repository
        accountRepository.save(new Account().setPassword(signUpDTO.getPassword())
                .setUsername(signUpDTO.getUsername())
                .setSignedIn(true)
                .setFullName(signUpDTO.getFullName())
        );

    }

    //ToDo Sign In
    public void signin(SignInDTO signinDTO) {
        //Apakah accountnya ada didata source
        //Username
        Optional<Account> accountIn = accountRepository.findByUsername(signinDTO.getUsername());
        if (!accountIn.isPresent()) {
            throw new RuntimeException();
        }

        //Password
        Account account = accountIn.get();
        if (!account.getPassword().equals(signinDTO.getPassword())) {
            throw new RuntimeException();
        }
        //Save
        accountRepository.save(account.setSignedIn(true));
    }

    //ToDo Sign Out
    public void signout(SignOutDTO signOutDTO) {
        Optional<Account> accountOut = accountRepository.findByUsername(signOutDTO.getUsername());
        if (!accountOut.isPresent()) {
            throw new RuntimeException();
        }
        //Save
        Account account = accountOut.get();
        //Jika ada boolean pake is untuk ngretrieve data
        if (!account.isSignedIn()) {
            throw new RuntimeException();
        }
        accountRepository.save(account.setSignedIn(false));
    }
}
