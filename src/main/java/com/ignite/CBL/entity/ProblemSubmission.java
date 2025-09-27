package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "problem_submissions")
@Getter
@Setter
public class ProblemSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "submission_id")
    private Integer submissionId;

    @Column(name = "language",nullable = false)
    private String language;

    @Lob
    @Column(name = "code",nullable = false)
    private String code;

    @Column(name = "submitted_at",nullable = false)
    private LocalDateTime submittedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id",nullable = false)
    private Problem problem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_problem_report_id",nullable = false)
    private UserProblemReport userProblemReport;

    @PrePersist
    protected void onCreate() {
        this.submittedAt = LocalDateTime.now();
    }

}
