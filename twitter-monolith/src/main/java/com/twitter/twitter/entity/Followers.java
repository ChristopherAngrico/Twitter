package com.twitter.twitter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class Followers {
    private long userId;
    private String userName;
}
