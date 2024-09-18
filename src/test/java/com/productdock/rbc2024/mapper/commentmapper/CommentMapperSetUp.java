package com.productdock.rbc2024.mapper.commentmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;

class CommentMapperSetUp {

    //TODO complete after second testing workshop

    static final long ID = 1L;
    static final String CONTENT = "content";

    public static final String TITLE = "title";
    public static final String AUTHOR = "author";
    public static final int NUMBER_OF_PAGES = 123;

    static Comment createComment() {
        return Comment.builder()
                .id(ID)
                .content(CONTENT)
                .book(createBook())
                .build();
    }

    static CommentDto createCommentDto() {
        return CommentDto.builder()
                .id(ID)
                .content(CONTENT)
                .build();
    }

    static BookDetailsDto createBookDto() {
        return BookDetailsDto.builder()
                .id(ID)
                .title(TITLE)
                .author(AUTHOR)
                .numberOfPages(NUMBER_OF_PAGES)
                .build();
    }

    static Book createBook() {
        return Book.builder()
                .id(ID)
                .title(TITLE)
                .author(AUTHOR)
                .numberOfPages(NUMBER_OF_PAGES)
                .build();
    }
}
