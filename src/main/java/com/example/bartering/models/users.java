package com.example.bartering.models;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class users {
    private int id;
    private String email;
    private String password;
    private String name;

    public users() {
    }

    public users(int id, String email, String username, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
