package com.twitter.twitter.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors
public class ProfileResponseDTO {
    private String fullName;
    private Date dateJoined;
    private String phoneNumber;
    private String status;
}
