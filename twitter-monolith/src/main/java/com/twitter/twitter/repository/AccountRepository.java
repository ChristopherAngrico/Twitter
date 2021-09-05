package com.twitter.twitter.repository;

import com.twitter.twitter.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AccountRepository {

    private Long counter = 1L;
    private List<Account> accounts = new ArrayList<>();

    public Account save(Account account){
        account.setId(counter);
        counter ++;
        accounts.add(account);
        return account;
    }

    public Optional<Account> findById(Long id){
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .findFirst();
    }

    public Optional<Account> findByUsername(String username){
        return accounts.stream()
                .filter(account -> account.getUsername().equals(username))
                .findFirst();
    }
}
