package com.StockPulse.StockPulse.models;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity //JPA to save to database, allows it to be mapped to database
@Table(name = "users") // maps to a database table named "users", we can change but be careful of naming conventions


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA will delegate a task of generating a unique primary key value to the database automatically
    private Long id;

    @Column(nullable = false, unique = true) //column cannot contain null values, unique values only
    private String username;

    @Column(nullable = false) //user cannot have empty password
    private String password;

    @Column(nullable = false, unique = true) //cannot contain null values, unique emails only no dups or an violation error will be thrown
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
