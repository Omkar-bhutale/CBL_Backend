package com.ignite.CBL.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
public class UserBatchAssignmentId  implements Serializable {
    @Column(name = "user_id",nullable = false)
    private String userId;
    @Column(name = "sub_batch_id",nullable = false)
    private Integer subBatchId;


}
