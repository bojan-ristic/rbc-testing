package com.productdock.rbc2024.unit;

import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.model.Book;
import com.productdock.rbc2024.repository.BookRepository;
import com.productdock.rbc2024.service.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestExamples {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private BookMapper bookMapper;

    @Spy
    List<String> spiedList = new ArrayList<>();

    private static Stream<Arguments> getBooks() {
        return Stream.of(
                Arguments.of("The Hobbit", "J.R.R. Tolkien", 310),
                Arguments.of("1984", "George Orwell", 328),
                Arguments.of("To Kill a Mockingbird", "Harper Lee", 281)
        );
    }

    @ParameterizedTest
    @DisplayName("return correct number of pages for different books (an example for @ParameterizedTest)")
    @MethodSource("getBooks")
    void testGetNumberOfPages(String title, String author, Integer expectedPages) {
        var book = Book.builder()
                .title(title)
                .author(author)
                .numberOfPages(expectedPages)
                .build();
        when(bookRepository.findByTitleContainingIgnoreCase(title)).thenReturn(List.of(book));

        int numberOfPages = bookService.getNumberOfPages(title);

        assertEquals(expectedPages, numberOfPages);
        verify(bookRepository, times(1)).findByTitleContainingIgnoreCase(title);
    }

    @Test
    @DisplayName("verify if spy works correctly (an example for @Spy)")
    public void verifyIfSpyWorksCorrectly() {
        spiedList.add("one");
        spiedList.add("two");

        verify(spiedList).add("one");
        verify(spiedList).add("two");

        assertEquals(2, spiedList.size());

        doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

}
