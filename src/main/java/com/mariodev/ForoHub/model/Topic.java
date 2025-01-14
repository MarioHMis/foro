package com.mariodev.ForoHub.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String message;

    private LocalDateTime creationDate = LocalDateTime.now();

    private String status;

    @ManyToOne
    private User author;

    @ManyToOne
    private Course course;
}