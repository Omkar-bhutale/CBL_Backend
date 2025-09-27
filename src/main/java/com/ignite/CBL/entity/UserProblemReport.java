package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_problem_reports", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "problem_id"})
})
@Getter
@Setter
public class UserProblemReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_problem_report_id")
    private Integer userProblemReportId;

    @Column(name = "is_solved",nullable = false)
    private boolean isSolved = false;

    @Column(name = "total_attempts",nullable = false)
    private int totalAttempts;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "languages_used",nullable = false,columnDefinition = "json")
    private List<String> languagesUsed;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "insight",nullable = false,columnDefinition = "json")
    private Insight insight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id",nullable = false)
    private Problem problem;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userProblemReport")
    private Set<ProblemSubmission> problemSubmissions = new HashSet<>();


//    private I
}
