package com.productdock.rbc2024.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDto {

    private Long id;

    private String title;

    private String author;

    private Integer numberOfPages;


}
