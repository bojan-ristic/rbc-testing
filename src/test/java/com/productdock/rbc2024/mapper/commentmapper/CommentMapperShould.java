package com.productdock.rbc2024.mapper.commentmapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.mapper.CommentMapper;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommentMapperShould {

    //TODO complete after second testing workshop

    private CommentMapper commentMapper;

    @BeforeEach
    void setUp() { commentMapper = new CommentMapper(new BookMapper()); }

    //testiramo da li ce metoda convertModelToCommentDto uspesno
    //konvertovati DTO objekat u model komentara
    @Test
    void convertCommentDtoToModelTest() {
        //given
        CommentDto commentDto = CommentMapperSetUp.createCommentDto();
        BookDetailsDto bookDto = CommentMapperSetUp.createBookDto();

        //when
        Comment actual = commentMapper.convertCommentDtoToModel(commentDto, bookDto);

        //then
        Comment expected = CommentMapperSetUp.createComment();
        assertTrue(compareComments(expected, actual));
    }

    //testiramo da li ce metoda convertCommentDtoToModel uspesno
    //konvertovati model komentara u DTO objekat
    @Test
    void convertModelToCommentDto() {
        //given
        Comment comment = CommentMapperSetUp.createComment();

        //when
        CommentDto actual = commentMapper.convertModelToCommentDto(comment);

        //then
        CommentDto expected = CommentMapperSetUp.createCommentDto();
        assertEquals(expected, actual);
    }

    private boolean compareComments(Comment first, Comment second) {
        return first.getId().equals(second.getId())
                && first.getContent().equals(second.getContent())
                && compareBooks(first.getBook(), second.getBook());
    }

    private boolean compareBooks(Book first, Book second) {
        return first.getId().equals(second.getId())
                && first.getAuthor().equals(second.getAuthor())
                && first.getNumberOfPages().equals(second.getNumberOfPages());
    }
}
