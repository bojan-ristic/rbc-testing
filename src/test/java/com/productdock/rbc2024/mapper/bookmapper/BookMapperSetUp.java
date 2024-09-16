package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.model.Book;

class BookMapperSetUp {
    static final long BOOK_ID = 1L;
    static final String BOOK_NEW_AUTHOR = "author";
    static final String BOOK_TITLE = "title";
    static final int BOOK_NUMBER_OF_PAGES = 120;

    static Book createBook() {
        return Book.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static BookDetailsDto createExpectedResultBookDetailsDto() {
        return BookDetailsDto.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

}
