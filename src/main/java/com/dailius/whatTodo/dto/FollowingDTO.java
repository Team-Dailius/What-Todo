package com.dailius.whatTodo.dto;

import com.dailius.whatTodo.domain.Following;
import com.dailius.whatTodo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowingDTO {
    private long id;
    private User userId;
    private User followingUserId;

    public FollowingDTO(Following following) {
        this.id = following.getId();
        this.userId = following.getUserId();
        this.followingUserId = following.getFollowingUserId();
    }
}
