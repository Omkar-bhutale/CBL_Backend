package com.ignite.CBL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
public class UserRoleId implements Serializable {

    @Column(name = "user_id",nullable = false)
    private String userId;
    @Column(name = "role_id",nullable = false)
    private Integer roleId;

}
