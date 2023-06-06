package com.dailius.whatTodo.domain;

import com.dailius.whatTodo.domain.constant.SharingRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Goals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goalsId")
    private long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;

    @Column(length = 100)
    private String content;             // 내용

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(nullable = false)
    private LocalDate dueDate;          // 마감일

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SharingRange sharingRange;  // 공개 범위

    private boolean isDone;             // 완료 여부
}
