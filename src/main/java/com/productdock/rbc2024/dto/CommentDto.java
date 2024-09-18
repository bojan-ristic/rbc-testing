package com.productdock.rbc2024.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CommentDto implements Comparable {

    private Long id;

    private String content;


    @Override
    public int compareTo(Object o) {
        CommentDto other = (CommentDto)o;

        return this.content.compareTo(other.content);
    }
}
