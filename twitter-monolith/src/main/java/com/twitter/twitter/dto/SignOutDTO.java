package com.twitter.twitter.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class SignOutDTO {
    private String username;
    private String password;
}
