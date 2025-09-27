package com.ignite.CBL.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name", nullable = false, unique = true)
    private String role_name;


    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<UserRole> userRoles = new HashSet<>();
}
