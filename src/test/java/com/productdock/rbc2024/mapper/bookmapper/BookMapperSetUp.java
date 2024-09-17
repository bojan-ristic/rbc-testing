package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.dto.EditBookDetailsDto;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;

import java.util.List;

class BookMapperSetUp {
    static final int EDIT_BOOK_NUMBER_OF_PAGES = 10;
    static final String EDIT_BOOK_TITLE = "new title";

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

    static BookDto createExpectedResultBookDto() {
        return BookDto.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static BookDetailsDto createBookDetailsDto() {
        return BookDetailsDto.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static EditBookDetailsDto createEditBookDetailsDto() {
        return EditBookDetailsDto.builder()
                .numberOfPages(EDIT_BOOK_NUMBER_OF_PAGES)
                .title(EDIT_BOOK_TITLE)
                .build();
    }

    static Book createExpectedResultEditedBook() {
        return Book.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(EDIT_BOOK_TITLE)
                .numberOfPages(EDIT_BOOK_NUMBER_OF_PAGES)
                .build();
    }
}
