package com.ignite.CBL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

@Embeddable
@Data
public class UserProblemEngagementId {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "problem_id")
    private Integer problemId;



}
