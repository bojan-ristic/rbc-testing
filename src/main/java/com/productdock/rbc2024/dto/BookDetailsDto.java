package com.productdock.rbc2024.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Data
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class BookDetailsDto {

    private Long id;

    private String title;

    private String author;

    private Integer numberOfPages;

}
