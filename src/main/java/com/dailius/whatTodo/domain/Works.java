package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.Color;
import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Works {
    @Id
    private long id;
    private long userId;
    private int category;
    private String content;
    private LocalDate date;
    private SharingRange sharingRange;
}
