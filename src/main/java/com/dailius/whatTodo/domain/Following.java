package com.dailius.whatTodo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Following {
    @Id
    private long id;
    private long userId;                // 유저 아이디
    private long followingUserId;       // 팔로잉하는 계정
}
