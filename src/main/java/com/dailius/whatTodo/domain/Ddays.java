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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Ddays {
    @Id
    private long id;

    @ManyToOne
    private User UserId;

    @OneToOne
    @Column(nullable = false)
    private Category category;

    @Column(length = 100)
    private String content;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(nullable = false)
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private SharingRange sharingRange;
}
