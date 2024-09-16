package com.productdock.rbc2024.mapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.model.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentMapper {

    private final BookMapper bookMapper;

    public Comment convertCommentDtoToModel(CommentDto commentDto, BookDetailsDto bookDto) {
        return Comment.builder()
                .id(commentDto.getId())
                .content(commentDto.getContent())
                .book(bookMapper.convertBookDetailsDtoToModel(bookDto))
                .build();
    }

    public CommentDto convertModelToCommentDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .content(comment.getContent())
                .build();
    }

}
