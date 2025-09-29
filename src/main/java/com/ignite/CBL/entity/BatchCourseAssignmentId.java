package com.ignite.CBL.entity;

import
        jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@Data
public class BatchCourseAssignmentId implements Serializable {

    @Column(name = "batch_id")
    private Integer batchId;

    @Column(name = "course_id")
    private Integer courseId;


}