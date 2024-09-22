package com.productdock.rbc2024.component.service.bookservice;

import com.productdock.rbc2024.component.ComponentTestBase;
import com.productdock.rbc2024.repository.BookRepository;
import com.productdock.rbc2024.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static com.productdock.rbc2024.component.service.bookservice.BookServiceSetUp.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceCT extends ComponentTestBase {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @BeforeEach
    void beforeEach() {
        bookRepository.deleteAll();
    }

    @Test
    void getById() {
        var book = createBook();
        bookRepository.save(book);

        var actual = bookService.getById(BOOK_ID);

        var expectedBookDto = createExpectedBookDto();
        assertEquals(expectedBookDto, actual);
    }

}
