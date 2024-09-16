package com.productdock.rbc2024.mapper;

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

}
