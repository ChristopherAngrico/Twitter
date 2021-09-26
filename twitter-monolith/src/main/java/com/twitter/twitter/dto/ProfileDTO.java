package com.twitter.twitter.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors
public class ProfileDTO {
    private String fullName;
    private Date dateJoined;
    private String phoneNumber;
    private String status;
}
