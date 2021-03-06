package com.stem.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "roles", indexes = {
        @Index(name = "role_id", columnList = "role_id", unique = true)
})
@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class RoleEntity {

    @Id
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "role_name", length = 50)
    private String roleName;

    public RoleEntity withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public RoleEntity withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
}