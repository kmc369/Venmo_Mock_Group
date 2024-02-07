package com.StockPulse.StockPulse.models;

import jakarta.persistence.*;
import lombok.Getter;


public class User {
    private Long id;
    private String username;
    private String password;
    private String email;

    public User(Long id,String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public Long getId() {
        return id;
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
