package com.productdock.rbc2024.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

}
