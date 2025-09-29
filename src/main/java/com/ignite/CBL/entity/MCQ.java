package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mcqs")
@Getter
@Setter
public class MCQ {
    @Id
    @Column(name = "mcq_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mcqId;

    @Lob
    @Column(name = "question",nullable = false)
    private String question;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "options",nullable = false)
    private McqOptions options;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id", nullable = false)
    private Topic topic;

    @OneToMany(
            mappedBy = "mcq",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<McqAttempt> mcqAttempts = new HashSet<>();




}
