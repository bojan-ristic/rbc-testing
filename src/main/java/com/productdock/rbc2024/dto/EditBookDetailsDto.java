package com.productdock.rbc2024.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EditBookDetailsDto {

    private Integer numberOfPages;

    private String title;

}
