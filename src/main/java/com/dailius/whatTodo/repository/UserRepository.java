package com.dailius.whatTodo.repository;


import com.dailius.whatTodo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
