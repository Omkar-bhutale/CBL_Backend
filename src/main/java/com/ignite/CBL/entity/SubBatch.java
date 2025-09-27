package com.ignite.CBL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sub_batchs")
@Getter
@Setter
public class SubBatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_batch_id")
    private Integer subBatchId;

    @Column(name = "sub_batch_name",nullable = false)
    private String subBatchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id",nullable = false)
    private Batch batch;



    @OneToMany(mappedBy = "subBatch",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<UserBatchAssignment> userBatchAssignments = new HashSet<>();


}
