package com.logan.app.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data // this generates getters, toString, and more from lombok
@AllArgsConstructor
@NoArgsConstructor
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

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPassword(String password) {
        this.Password = password;
    }

}
