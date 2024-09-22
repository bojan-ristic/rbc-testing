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
    void convertModelToBookDto(){

        //given
        var book = BookMapperSetUp.createBook();
        //when
        var bookDto = bookMapper.convertModelToBookDto(book);
        //then
        var expected = BookMapperSetUp.createExpectedResultBookDto();
        assertEquals(expected, bookDto);
    }

    @Test
    void convertBookDetailsDtoToModel(){

        //given
        var bookDetailsDto = BookMapperSetUp.createBookDetailsDto();
        //when
        var book = bookMapper.convertBookDetailsDtoToModel(bookDetailsDto);
        //then
        var expected = BookMapperSetUp.createExpectedResultBook();
        assertEquals(expected, book);
    }

    @Test
    void convertEditBookDetailsDtoToModel(){

        //given
        var editBookDetailsDto = BookMapperSetUp.createEditBookDetailsDto();
        var book = BookMapperSetUp.createBook();
        //when
        var actualBook = bookMapper.convertEditBookDetailsDtoToModel(editBookDetailsDto, book);
        //then
        var expected = BookMapperSetUp.createExpectedResultBook();
        assertEquals(expected, actualBook);
    }

}
