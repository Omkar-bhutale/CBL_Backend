package com.ignite.CBL.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "MCQ_Attempts")
@Getter
@Setter
public class McqAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attempt_id")
    private Integer attemptId;

    @Column(name = "selected_option", nullable = false)
    private String selectedOption;

    @Column(name = "is_correct", nullable = false)
    private boolean isCorrect;

    @Column(name = "attempted_at", updatable = false)
    private LocalDateTime attemptedAt;

    // Many-to-One: Many attempts can be made by one User.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Many-to-One: Many attempts can be for one MCQ.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mcq_id", nullable = false)
    private MCQ mcq;

    @PrePersist
    protected void onCreate() {
        attemptedAt = LocalDateTime.now();
    }
}