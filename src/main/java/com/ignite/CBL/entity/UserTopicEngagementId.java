package com.ignite.CBL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class UserTopicEngagementId implements Serializable {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "topic_id")
    private Integer topicId;
}
