package com.dailius.whatTodo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @Column(length = 50)
    private String userId;           // 유저 아이디

    @Column(nullable = false)
    private String userName;        // 유저 네임

    @Column(nullable = false)
    private String userPassword;    // 비밀번호

    @Column(nullable = false, length = 100)
    private String email;           // 이메일
}
