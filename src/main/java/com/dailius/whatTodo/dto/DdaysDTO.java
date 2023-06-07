package com.dailius.whatTodo.dto;

import com.dailius.whatTodo.domain.Category;
import com.dailius.whatTodo.domain.Ddays;
import com.dailius.whatTodo.domain.User;
import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DdaysDTO {
    private long id;
    private User userId;
    private Category category;
    private String content;
    private LocalDate date;
    private SharingRange sharingRange;

    public DdaysDTO(Ddays ddays) {
        this.id = ddays.getId();
        this.userId = ddays.getUserId();
        this.content = ddays.getContent();
        this.date = ddays.getDate();
        this.sharingRange = ddays.getSharingRange();
    }
}
