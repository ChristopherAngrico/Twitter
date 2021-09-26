package com.twitter.twitter.service;

import com.twitter.twitter.dto.ProfileDTO;
import com.twitter.twitter.dto.request.ProfileRequestDTO;
import com.twitter.twitter.dto.response.ProfileResponseDTO;
import com.twitter.twitter.entity.Account;
import com.twitter.twitter.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProfileService {

    @Autowired
    private AccountRepository accountRepository;

    public ProfileResponseDTO getProfile(ProfileRequestDTO profileRequestDTO) {
        Account account = accountRepository.findByUsername(profileRequestDTO.getUsername())
                .orElseThrow(RuntimeException::new);

        if(!account.isSignedIn()) {
            throw new RuntimeException("User is not signed in!");
        }

        ProfileResponseDTO profileResponseDTO = new ProfileResponseDTO();
        profileResponseDTO.setFullName(account.getFullName());
        profileResponseDTO.setDateJoined(account.getDateJoined());
        profileResponseDTO.setPhoneNumber(account.getPhoneNumber());
        profileResponseDTO.setStatus(account.getStatus());
        return profileResponseDTO;
    }
}
