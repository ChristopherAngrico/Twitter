package com.twitter.twitter.repository;

import com.twitter.twitter.entity.Follow;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FollowRepository {

    private List<Follow> follows = new ArrayList<>();

    public Follow save(Follow follow) {
// Ini kalau mau update harus ngeremove  id dulu terus diadd dengan id yang baru
        if (!findByFollowerIdAndFollowedId(follow.getFollowerId(), follow.getFollowedId()).isPresent()) {
            follows.add(follow);
        }
        return follow;
    }
    
    //ToDo Create Delete

    public Optional<Follow> findByFollowerIdAndFollowedId(Long followerId, Long followedId) {
        return follows.stream()
                .filter(follow -> follow.getFollowerId().equals(followerId) && follow.getFollowedId().equals(followedId))
                .findFirst();
    }
}
