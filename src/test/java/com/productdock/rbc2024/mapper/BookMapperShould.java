package com.productdock.rbc2024.mapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
class BookMapperShould {

    private BookMapper bookMapper;

    @BeforeAll
    static void setup() {
        log.info("BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        log.info("AfterAll");
    }

    @BeforeEach
    void setUp() {
        bookMapper = new BookMapper();
        log.info("BeforeEach");
    }

    @AfterEach
    void teardown() {
        log.info("AfterEach");
    }

    @Test
    void convertModelToBookDetailsDto() {
        var book = new Book();

        var actual = bookMapper.convertModelToBookDetailsDto(book);

        var expected = new BookDetailsDto();
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

}
