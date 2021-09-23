package com.twitter.twitter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Account {

    private Long id;
    private String username;
    private String password;

    /*Sign in / Signout -> butuh marking apakah user nya sedang sign in atau nggak?*/
    private boolean signedIn;
    private String fullName;
    private Date dateJoined;
}
