package com.octans.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UserModel {

    @Id
    @Column(unique = true, nullable = false)
    private long id_user;

    @JoinColumn(name="id_role")
    private long id_role;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false, length = 3)
    private String active;

    public long getId_user() {
        return id_user;
    }
    public long getId_role() {
        return id_role;
    }

    public String getName() {
        return name;
    }

    public String getActive() {
        return active;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }
    public void setId_role(long id_role) {
        this.id_role = id_role;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setActive(String active) {
        this.active = active;
    }

}
