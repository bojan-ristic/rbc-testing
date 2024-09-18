package com.productdock.rbc2024.model;

import com.productdock.rbc2024.dto.CommentDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Comment implements Comparable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Override
    public int compareTo(Object o) {
        Comment other = (Comment)o;

        return this.content.compareTo(other.content);
    }
}
