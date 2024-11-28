package com.etsu.my_project_00.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "info_user_rol")
public class InfoUserRol {
    private Integer id;
    private Users user;
    private Role role;
    private String user_creation;
    private Date date_creation;
    private String user_modification;
    private Date date_modification;
    private String estado;

    //constructor
    public InfoUserRol(Integer id, Users user, Role role, String user_creation, Date date_creation,
            String user_modification, Date date_modification, String estado) {
        this.id = id;
        this.user = user;
        this.role = role;
        this.user_creation = user_creation;
        this.date_creation = date_creation;
        this.user_modification = user_modification;
        this.date_modification = date_modification;
        this.estado = estado;
    }

    //Generate Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUser_creation() {
        return user_creation;
    }

    public void setUser_creation(String user_creation) {
        this.user_creation = user_creation;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public String getUser_modification() {
        return user_modification;
    }

    public void setUser_modification(String user_modification) {
        this.user_modification = user_modification;
    }

    public Date getDate_modification() {
        return date_modification;
    }

    public void setDate_modification(Date date_modification) {
        this.date_modification = date_modification;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
