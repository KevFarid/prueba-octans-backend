package com.octans.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "Roles")
public class RoleModel {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_role;

    @Column(unique = true, nullable = false)
    private String name;

    public long getId_role() {
        return id_role;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId_role(long id_role) {
        this.id_role = id_role;
    }
}
