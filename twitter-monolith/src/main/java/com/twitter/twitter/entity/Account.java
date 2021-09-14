package com.twitter.twitter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Account {

    private Long id;
    private String username;
    private String password;

    /*ToDo Sign in / Signout -> butuh marking apakah user nya sedang sign in atau nggak? (Sudah)*/
    private boolean signedIn;
}
