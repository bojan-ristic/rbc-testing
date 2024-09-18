package com.productdock.rbc2024.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EditBookDetailsDto {

    private Integer numberOfPages;

    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditBookDetailsDto that = (EditBookDetailsDto) o;
        return Objects.equals(numberOfPages, that.numberOfPages) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPages, title);
    }
}
