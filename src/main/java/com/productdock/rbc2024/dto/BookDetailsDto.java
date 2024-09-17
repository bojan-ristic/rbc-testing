package com.productdock.rbc2024.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookDetailsDto {

    private Long id;

    private String title;

    private String author;

    private Integer numberOfPages;

}
