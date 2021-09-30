package com.twitter.twitter.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Follow {
    private Long followerId;
    private Long followedId;
}
