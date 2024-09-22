package com.productdock.rbc2024.mapper.bookmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.dto.EditBookDetailsDto;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;

import java.util.List;

class BookMapperSetUp {
    static final long BOOK_ID = 1L;
    static final String BOOK_NEW_AUTHOR = "author";
    static final String BOOK_TITLE = "title";
    static final int BOOK_NUMBER_OF_PAGES = 120;

    static final long FIRST_COMMENT_ID = 1L;
    static final String FIRST_COMMENT_CONTENT = "comment_content";

    static final long SECOND_COMMENT_ID = 2L;
    static final String SECOND_COMMENT_CONTENT = "comment_content";

    static Book createBook() {
        return Book.builder()
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
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    private static List<Comment> createComments() {
        var theFirstComment = createComment(FIRST_COMMENT_ID, FIRST_COMMENT_CONTENT, null);
        var theSecondComment = createComment(SECOND_COMMENT_ID, SECOND_COMMENT_CONTENT, null);
        return List.of(theFirstComment, theSecondComment);
    }

    private static Comment createComment(Long id, String content, Book book) {
        return Comment.builder()
                .id(id)
                .content(content)
                .book(book)
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

    static Book createExpectedResultBook() {
        return Book.builder()
                .id(BOOK_ID)
                .author(BOOK_NEW_AUTHOR)
                .title(BOOK_TITLE)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

}
