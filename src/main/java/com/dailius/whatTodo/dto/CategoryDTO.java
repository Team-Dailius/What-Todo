package com.dailius.whatTodo.dto;

import com.dailius.whatTodo.domain.Category;
import com.dailius.whatTodo.domain.User;
import com.dailius.whatTodo.domain.constant.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    private long id;
    private User userDTO;
    private String content;
    private Color color;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.userDTO = category.getUserId();
        this.content = category.getContent();
        this.color = category.getColor();
    }
}
