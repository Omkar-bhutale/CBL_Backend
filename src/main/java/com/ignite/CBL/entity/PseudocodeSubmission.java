package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pseudocode_submissions")
public class PseudocodeSubmission {

    @Id
    @Column(name = "pseudocode_submission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pseudocodeSubmissionId;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "version",nullable = false)
    private int version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id",nullable = false)
    private Problem problem;
}
