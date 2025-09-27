package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_batch_assignments")
@Getter
@Setter
public class UserBatchAssignment {

    @EmbeddedId
    private UserBatchAssignmentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("subBatchId")
    @JoinColumn(name = "sub_batch_id")
    private SubBatch subBatch;
}
