package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Category {
    @Id
    private long id;
    private long userId;
    private String content;
    private Color color;
}
