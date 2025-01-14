package com.mariodev.ForoHub.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String message;

    private LocalDateTime creationDate = LocalDateTime.now();

    private Boolean isSolution;

    @ManyToOne
    private Topic topic;

    @ManyToOne
    private User author;
}