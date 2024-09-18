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
public class BookDetailsDto {

    private Long id;

    private String title;

    private String author;

    private Integer numberOfPages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDetailsDto that = (BookDetailsDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(numberOfPages, that.numberOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, numberOfPages);
    }
}
