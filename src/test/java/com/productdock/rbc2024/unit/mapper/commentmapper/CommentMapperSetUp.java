package com.productdock.rbc2024.unit.mapper.commentmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;

class CommentMapperSetUp {

    private static final long COMMENT_ID = 1L;
    private static final String COMMENT_CONTENT = "comment_content";

    private static final long BOOK_ID = 1L;
    private static final String BOOK_TITLE = "title";
    private static final String BOOK_AUTHOR = "author";
    private static final int BOOK_NUMBER_OF_PAGES = 120;

    static CommentDto commentDto() {
        return CommentDto.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .build();
    }

    static BookDetailsDto bookDetailsDto() {
        return BookDetailsDto.builder()
                .id(BOOK_ID)
                .title(BOOK_TITLE)
                .author(BOOK_AUTHOR)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static Book book() {
        return Book.builder()
                .id(BOOK_ID)
                .title(BOOK_TITLE)
                .author(BOOK_AUTHOR)
                .numberOfPages(BOOK_NUMBER_OF_PAGES)
                .build();
    }

    static Comment expectedComment() {
        var book = book();
        return Comment.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .book(book)
                .build();
    }

    static Comment comment() {
        var book = book();
        return Comment.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .book(book)
                .build();
    }

    static CommentDto expectedCommentDto() {
        return CommentDto.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .build();
    }

}
