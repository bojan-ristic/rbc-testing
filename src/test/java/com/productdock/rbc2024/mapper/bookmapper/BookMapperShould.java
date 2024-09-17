package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.mapper.BookMapper;
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
        var bookDetailsDto = bookMapper.convertModelToBookDetailsDto(book);

        // then
        var expected = BookMapperSetUp.createExpectedResultBookDetailsDto();
        assertEquals(expected, bookDetailsDto);
    }

    @Test
    void convertModelToBookDto() {
        var book = BookMapperSetUp.createBook();

        var bookDto = bookMapper.convertModelToBookDto(book);

        var expected = BookMapperSetUp.createExpectedResultBookDto();
        assertEquals(expected, bookDto);
    }

    @Test
    void convertBookDetailsDtoToModel() {
        var bookDetailsDto = BookMapperSetUp.createBookDetailsDto();

        var book = bookMapper.convertBookDetailsDtoToModel(bookDetailsDto);

        var expected = BookMapperSetUp.createBook();
        assertEquals(expected, book);
        assertEquals(expected.getId(), book.getId());
        assertEquals(expected.getAuthor(), book.getAuthor());
        assertEquals(expected.getTitle(), book.getTitle());
        assertEquals(expected.getNumberOfPages(), book.getNumberOfPages());
    }

    @Test
    void convertEditBookDetailsDtoToModel() {
        var editBookDto = BookMapperSetUp.createEditBookDetailsDto();
        var book = BookMapperSetUp.createBook();

        var actual = bookMapper.convertEditBookDetailsDtoToModel(editBookDto, book);

        var expected = BookMapperSetUp.createExpectedResultEditedBook();
        assertEquals(expected, actual);
    }

}
