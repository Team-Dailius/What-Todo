package com.dailius.whatTodo.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "followId")
    private long id;

    @ManyToOne
    private User userId;                // 유저 아이디

    @ManyToOne
    private User followingUserId;       // 팔로잉하는 계정
}
