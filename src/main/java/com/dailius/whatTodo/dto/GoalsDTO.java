package com.dailius.whatTodo.dto;

import com.dailius.whatTodo.domain.Goals;
import com.dailius.whatTodo.domain.User;
import com.dailius.whatTodo.domain.constant.MonthlyOrWeekly;
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
public class GoalsDTO {
    private long id;
    private User userId;
    private String content;
    private LocalDate dueDate;
    private SharingRange sharingRange;
    private MonthlyOrWeekly monthlyOrWeekly;
    private boolean isDone;

    public GoalsDTO(Goals goals) {
        this.id = goals.getId();
        this.userId = goals.getUserId();
        this.content = goals.getContent();
        this.dueDate = goals.getDueDate();
        this.sharingRange = goals.getSharingRange();
        this.monthlyOrWeekly = goals.getMonthlyOrWeekly();
        this.isDone = goals.isDone();
    }
}
