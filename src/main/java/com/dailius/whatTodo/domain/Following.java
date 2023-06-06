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
    @Column(name = "followingId")
    private long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;                // 유저 아이디

    @ManyToOne
    @JoinColumn(name = "followingUserId")
    private User followingUserId;       // 팔로잉하는 계정
}
