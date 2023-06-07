package com.dailius.whatTodo.dto;

import com.dailius.whatTodo.domain.Category;
import com.dailius.whatTodo.domain.User;
import com.dailius.whatTodo.domain.Works;
import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorksDTO {
    private long id;
    private User userId;
    private Category category;
    private String content;
    private LocalDate date;
    private SharingRange sharingRange;

    public WorksDTO(Works works) {
        this.id = works.getId();
        this.userId = works.getUserId();
        this.category = works.getCategory();
        this.content = works.getContent();
        this.date = works.getDate();
        this.sharingRange = works.getSharingRange();
    }
}
