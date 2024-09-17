package com.productdock.rbc2024.mapper.commentmapper;

import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.mapper.CommentMapper;
import com.productdock.rbc2024.model.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class CommentMapperShould {

    private CommentMapper commentMapper;

    @BeforeEach
    void setUp() {
        commentMapper = new CommentMapper();
    }

    @Test
    void convertModelToCommentDto(){
        Comment commentToConvert = CommentMapperSetUp.createComment();
        CommentDto commentDtoToTest = commentMapper.convertModelToCommentDto(commentToConvert);
        CommentDto expectedCommentDtoResult = CommentMapperSetUp.createExpectedCommentDtoResult();

        assertThat(commentDtoToTest).usingRecursiveComparison().isEqualTo(expectedCommentDtoResult);
    }
}
