package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.dto.EditBookDetailsDto;
import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookMapperShould {

    private BookMapper bookMapper;

    @BeforeEach
    void setUp() {
        bookMapper = new BookMapper();
    }

    @Test
    void convertModelToBookDetailsDto() {
        // given
        var book = BookMapperSetUp.createBook();

        // when
        var actual = bookMapper.convertModelToBookDetailsDto(book);

        // then
        var expected = BookMapperSetUp.createExpectedResultBookDetailsDto();
        assertEquals(expected, actual);
    }

    @Test
    void convertModelToBookDto() {
        // given
        Book book = BookMapperSetUp.createBook();

        // when
        BookDto actual = bookMapper.convertModelToBookDto(book);

        // then
        BookDto expected = BookMapperSetUp.createBookDto();
        assertEquals(expected, actual);
    }

    @Test
    void convertBookDetailsDtoToModel() {
        // given
        BookDetailsDto book = BookMapperSetUp.createExpectedResultBookDetailsDto();

        // when
        Book actual = bookMapper.convertBookDetailsDtoToModel(book);

        // then
        Book expected = BookMapperSetUp.createBook();
        assertEquals(expected, actual);
    }

    @Test
    void convertEditBookDetailsDtoToModel() {
        // given
        EditBookDetailsDto bookDetailsDto = BookMapperSetUp.createExpectedEditBookDetailsDto();
        Book bookFromDB = BookMapperSetUp.createBook();

        // when
        Book actual = bookMapper.convertEditBookDetailsDtoToModel(bookDetailsDto, bookFromDB);

        // then
        Book expected = BookMapperSetUp.createBook();
        assertEquals(expected, actual);
    }
}
