package com.productdock.rbc2024.dto;

import lombok.*;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDetailsDto bookDetailsDto = (BookDetailsDto) o;
        return Objects.equals(id, bookDetailsDto.id) &&
                Objects.equals(title, bookDetailsDto.title) &&
                Objects.equals(author, bookDetailsDto.author) &&
                Objects.equals(numberOfPages, bookDetailsDto.numberOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, numberOfPages);
    }
}
