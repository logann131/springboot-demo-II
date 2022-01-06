package com.logan.app.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity 
@Data // this generates getters, toString, and more from lombok
public class UserModel {
    @Id // @Id is an annotation for primitive key
    @GeneratedValue
    private int id; //primary key

    private String Name;
    private String Email;
    private String Password;

    public Integer getId() {
        return id;
    }

    public Object getName() {
        return null;
    }

    public Object getEmail() {
        return null;
    }

    public Object getPassword() {
        return null;
    }

    public void setName(Object name2) {
    }

    public void setEmail(Object email2) {
    }

    public void setPassword(Object password2) {
    }

}
