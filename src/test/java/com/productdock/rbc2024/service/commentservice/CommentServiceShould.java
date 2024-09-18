package com.productdock.rbc2024.service.commentservice;

import com.productdock.rbc2024.mapper.BookMapper;
import com.productdock.rbc2024.mapper.CommentMapper;
import com.productdock.rbc2024.repository.BookRepository;
import com.productdock.rbc2024.repository.CommentRepository;
import com.productdock.rbc2024.service.CommentService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CommentServiceShould {

    @Mock
    private CommentRepository commentRepository;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private CommentMapper commentMapper;

    @Mock
    private BookMapper bookMapper;

    @InjectMocks
    private CommentService commentService;


}
