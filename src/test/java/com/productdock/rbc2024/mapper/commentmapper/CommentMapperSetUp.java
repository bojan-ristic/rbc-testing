package com.productdock.rbc2024.mapper.commentmapper;

import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.model.Comment;

public class CommentMapperSetUp {
    static final long COMMENT_ID = 1L;
    static final String COMMENT_CONTENT = "Great book for beginners";

    static Comment createComment () {
        return Comment.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .build();
    }

    static CommentDto createExpectedCommentDtoResult () {
        return CommentDto.builder()
                .id(COMMENT_ID)
                .content(COMMENT_CONTENT)
                .build();
    }
}
