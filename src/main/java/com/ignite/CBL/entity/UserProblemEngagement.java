package com.ignite.CBL.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user_problem_engagement") // Renamed for consistency with our schema
public class UserProblemEngagement {

    @EmbeddedId
    private UserProblemEngagementId id; // Renamed field for clarity

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("problemId")
    @JoinColumn(name = "problem_id")
    private Problem problem;

    @Column(name = "total_seconds_spent", nullable = false)
    private int totalSecondsSpent = 0;

    @Column(name = "total_attempts", nullable = false)
    private int totalAttempts = 0;

    @Column(name = "last_activity_at", nullable = false)
    private LocalDateTime lastActivityAt;
}