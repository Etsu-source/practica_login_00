package com.etsu.my_project_00.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String direccion;
    private String telefono;
    private String usuer_creation;
    private Date date_modification;
    private String photo;
    private String status;

    //Constructor
    public Users(Long id, String username, String password, String firstname, String lastname, String direccion,
            String telefono, String usuer_creation, Date date_modification, String photo, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.direccion = direccion;
        this.telefono = telefono;
        this.usuer_creation = usuer_creation;
        this.date_modification = date_modification;
        this.photo = photo;
        this.status = status;
    }

    //Generation an Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuer_creation() {
        return usuer_creation;
    }

    public void setUsuer_creation(String usuer_creation) {
        this.usuer_creation = usuer_creation;
    }

    public Date getDate_modification() {
        return date_modification;
    }

    public void setDate_modification(Date date_modification) {
        this.date_modification = date_modification;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
