package com.dailius.whatTodo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    private long userId;            // 유저 아이디
    private String userName;        // 유저 네임
    private String userPassword;    // 비밀번호
    private String email;           // 이메일
}
