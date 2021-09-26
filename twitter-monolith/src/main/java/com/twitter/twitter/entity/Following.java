package com.twitter.twitter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class Following {
    private long id;
    private String userName;
}
