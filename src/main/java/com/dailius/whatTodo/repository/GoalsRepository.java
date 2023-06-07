package com.dailius.whatTodo.repository;

import com.dailius.whatTodo.domain.Goals;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface GoalsRepository extends JpaAttributeConverter<Goals, Long> {
}
