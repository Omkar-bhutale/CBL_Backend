package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "problem_test_cases")
@Getter
@Setter
public class ProblemTestCase {
    @Id
    @Column(name = "test_case_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer testCaseId;

    @Lob
    @Column(name = "input")
    private String input;

    @Lob
    @Column(name = "expected_output")
    private String expectedOutput;

    @Column(name = "is_public", nullable = false)
    Boolean isPublic = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id", nullable = false)
    private Problem problem;



}
