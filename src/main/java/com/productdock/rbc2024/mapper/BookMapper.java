package com.productdock.rbc2024.mapper;

import com.productdock.rbc2024.dto.BookDetailsDto;
import com.productdock.rbc2024.dto.BookDto;
import com.productdock.rbc2024.dto.EditBookDetailsDto;
import com.productdock.rbc2024.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDetailsDto convertModelToBookDetailsDto(Book book) {
        var bookDetailsDto = new BookDetailsDto();
        bookDetailsDto.setId(book.getId());
        bookDetailsDto.setTitle(book.getTitle());
        bookDetailsDto.setAuthor(book.getAuthor());
        bookDetailsDto.setNumberOfPages(book.getNumberOfPages());
        return bookDetailsDto;
    }

    public BookDto convertModelToBookDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .numberOfPages(book.getNumberOfPages())
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

    public Book convertEditBookDetailsDtoToModel(EditBookDetailsDto dto, Book bookFromDdb) {
        bookFromDdb.setTitle(dto.getTitle());
        bookFromDdb.setNumberOfPages(dto.getNumberOfPages());
        return bookFromDdb;
    }

}
