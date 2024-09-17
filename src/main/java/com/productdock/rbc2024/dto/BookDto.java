package com.productdock.rbc2024.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {

    private Long id;

    private String title;

    private String author;

    private Integer numberOfPages;

    private List<CommentDto> comments;

}
