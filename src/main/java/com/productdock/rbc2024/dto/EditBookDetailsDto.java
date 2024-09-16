package com.productdock.rbc2024.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EditBookDetailsDto {

    private Integer numberOfPages;

    private String title;

}
