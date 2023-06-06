package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Category {
    @Id
    private long id;

    @ManyToOne
    private User userId;

    @Column(length = 100)
    private String content;

    @Enumerated(EnumType.STRING)
    private Color color;
}
