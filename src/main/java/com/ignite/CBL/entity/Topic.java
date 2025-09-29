package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
@Getter
@Setter
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Integer topicId;
    @Column(name = "title", nullable = false)
    private String title;

//    private TopicContent topicContent;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "content", nullable = false)
    private TopicContent content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creater_id", nullable = false)
    private User createdBy;


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
