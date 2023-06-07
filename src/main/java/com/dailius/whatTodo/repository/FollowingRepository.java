package com.dailius.whatTodo.repository;

import com.dailius.whatTodo.domain.Following;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowingRepository extends JpaRepository<Following, Long> {
}
