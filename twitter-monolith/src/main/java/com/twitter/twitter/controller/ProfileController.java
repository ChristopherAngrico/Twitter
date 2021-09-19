package com.twitter.twitter.controller;

import com.twitter.twitter.dto.request.ProfileRequestDTO;
import com.twitter.twitter.dto.response.ProfileResponseDTO;
import com.twitter.twitter.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/profile")
@Slf4j
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping
    public ProfileResponseDTO getProfile(@RequestBody ProfileRequestDTO requestDTO) {
        log.info("Get Profile : {}", requestDTO);
        return service.getProfile(requestDTO);
    }
}
