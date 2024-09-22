package com.productdock.rbc2024.unit.service.bookservice;

import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.model.Book;

class BookServiceSetUp {

    static final long BOOK_ID = 1L;
    private static final String BOOK_TITLE = "title";
    private static final String BOOK_AUTHOR = "author";
    private static final int BOOK_NUMBER_OF_PAGES = 120;

    static Book createBook() {
        return Book.builder()
                .id(BOOK_ID)
                .title(BOOK_TITLE)
                .author(BOOK_AUTHOR)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static BookDto createBookDto() {
        return BookDto.builder()
                .id(BOOK_ID)
                .title(BOOK_TITLE)
                .author(BOOK_AUTHOR)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static BookDto createExpectedBookDto() {
        return BookDto.builder()
                .id(BOOK_ID)
                .title(BOOK_TITLE)
                .author(BOOK_AUTHOR)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

}
