package com.productdock.rbc2024.mapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.dto.CommentDto;
import com.productdock.rbc2024.dto.EditBookDetailsDto;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.model.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {

    public BookDetailsDto convertModelToBookDetailsDto(Book book) {
        return BookDetailsDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .numberOfPages(book.getNumberOfPages())
                .build();
    }

    public BookDto convertModelToBookDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .numberOfPages(book.getNumberOfPages())
                .comments(convertCommentToDto(book.getComments()))
                .build();
    }

    private List<CommentDto> convertCommentToDto(List<Comment> comments) {
        return comments.stream()
                .map(BookMapper::convertCommentToCommentDto)
                .collect(Collectors.toList());
    }

    private static CommentDto convertCommentToCommentDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .content(comment.getContent())
                .build();
    }

    public Book convertBookDetailsDtoToModel(BookDetailsDto bookDetailsDto) {
        return Book.builder()
                .id(bookDetailsDto.getId())
                .title(bookDetailsDto.getTitle())
                .author(bookDetailsDto.getAuthor())
                .numberOfPages(bookDetailsDto.getNumberOfPages())
                .build();
    }

    public Book convertEditBookDetailsDtoToModel(EditBookDetailsDto dto, Book bookFromDdb){
        bookFromDdb.setTitle(dto.getTitle());
        bookFromDdb.setNumberOfPages(dto.getNumberOfPages());
        return bookFromDdb;
    }

}
