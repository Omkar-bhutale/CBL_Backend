package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "problems")
@Getter
@Setter
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    private Integer problemId;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "description",nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty",nullable = false)
    private Difficulty difficulty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id",nullable = false)
    private Topic topic;

    @OneToMany(mappedBy = "problem",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<ProblemTestCase> testCases = new HashSet<>();

    public void addTestCase(ProblemTestCase testCase){
        this.testCases.add(testCase);
        testCase.setProblem(this);
    }

    public void removeTestCase(ProblemTestCase testCase){
        this.testCases.remove(testCase);
        testCase.setProblem(null);
    }




}
