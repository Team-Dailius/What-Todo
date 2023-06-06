package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Goals {
    @Id
    private long id;
    private long userId;
    private String content;             // 내용
    private LocalDate dueDate;          // 마감일
    private SharingRange sharingRange;  // 공개 범위
    private boolean isDone;             // 완료 여부
}
