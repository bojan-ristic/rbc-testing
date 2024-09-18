package com.productdock.rbc2024.examples.componenttests;

import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.repository.BookRepository;
import com.productdock.rbc2024.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class BookServiceIT extends SpringContextTestBase {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @BeforeEach
    void beforeEach() {
        bookRepository.deleteAll();
    }

    @Test
    void getById() {
        var bookDocument = new Book();
        bookRepository.save(bookDocument);

        var actual = bookService.getById(1L);

        //assertThat(actual).hasSize(actual.size());
    }

}
