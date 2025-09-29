package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Batch_Course_Assignments")
@Getter
@Setter
public class BatchCourseAssignment {

    @EmbeddedId
    private BatchCourseAssignmentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("batchId")
    @JoinColumn(name = "batch_id")
    private Batch batch;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;


}