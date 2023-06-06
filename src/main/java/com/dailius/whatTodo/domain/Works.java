package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.Color;
import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Works {
    @Id
    private long id;

    @ManyToOne
    private User userId;

    @OneToOne
    private Category category;      // 카테고리

    @Column(length = 100)
    private String content;        // 내용

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(nullable = false)
    private LocalDate date;         // 날짜

    @Enumerated(EnumType.STRING)
    private SharingRange sharingRange;  // 공개 범위
}
