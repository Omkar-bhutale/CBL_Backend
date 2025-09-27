package com.ignite.CBL.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class McqAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mcqAttemptId;
    @Column(name = "selected_option",nullable = false)
    private String selectedOption;

    @Column(name = "is_correct",nullable = false)
    private boolean isCorrect;

    @Column(name = "attempted_at",nullable = false)
    private LocalDateTime attemptedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mcq_id",nullable = false)
    private MCQ mcq;

}

