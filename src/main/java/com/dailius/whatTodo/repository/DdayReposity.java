package com.dailius.whatTodo.repository;

import com.dailius.whatTodo.domain.Ddays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DdayReposity extends JpaRepository<Ddays, Long> {
}
