package com.twitter.twitter.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class SignUpDTO {
    private String username;
    private String password;
}
