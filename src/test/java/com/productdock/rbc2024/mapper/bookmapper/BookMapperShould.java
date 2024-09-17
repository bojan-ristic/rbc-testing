package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class BookMapperShould {

    private BookMapper bookMapper;

    @BeforeEach
    void setUp() {
        bookMapper = new BookMapper();
    }

    @Test
    void convertModelToBookDetailsDto() {
        Book bookToConvert = BookMapperSetUp.createBook();
        BookDetailsDto bookDetailsDtoToTest = bookMapper.convertModelToBookDetailsDto(bookToConvert);
        BookDetailsDto expectedBookDetailsDtoResult = BookMapperSetUp.createExpectedBookDetailsDtoResult();

        assertThat(bookDetailsDtoToTest).usingRecursiveComparison().isEqualTo(expectedBookDetailsDtoResult);
    }

    @Test
    void convertBookDetailsDtoToModel(){
        BookDetailsDto bookDetailsDtoToConvert = BookMapperSetUp.createBookDetailsDto();
        Book bookToTest = bookMapper.convertBookDetailsDtoToModel(bookDetailsDtoToConvert);
        Book expectedBookResult = BookMapperSetUp.createExpectedBookResult();

        assertThat(bookToTest).usingRecursiveComparison().isEqualTo(expectedBookResult);
    }

}
