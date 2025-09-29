package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "batchs")
@Getter
@Setter
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id")
    private Integer batchId;

    @Column(name = "batch_name",nullable = false)
    private String batchName;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;



    @OneToMany(
            mappedBy = "batch",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )


    private Set<BatchCourseAssignment> courseAssignments = new HashSet<>();
    @OneToMany(mappedBy = "batch",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<UserBatchAssignment> userBatchAssignments = new HashSet<>();






}
