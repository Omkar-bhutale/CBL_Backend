package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_topic_engagement")
@Getter
@Setter
public class UserTopicEngagement {

    @EmbeddedId
    private  UserTopicEngagementId userTopicEngagementId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    @JoinColumn(name = "user_id", updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("topicId")
    @JoinColumn(name = "topic_id", updatable = false)
    private Topic topic;

    @Column(name = "total_time_spent",nullable = false)
    private int totalTimeSpent = 0;

    @Column(name = "last_activity_at",nullable = false)
    private LocalDateTime lastActivityAt;

    @Column(name = "is_completed",nullable = false)
    private boolean isCompleted = false;

}
