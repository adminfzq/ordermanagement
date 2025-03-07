package com.example.ordermanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    
    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN或USER

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    // STATUS: PENDING, ACTIVE, INACTIVE
    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    // 枚举类
    public enum Role {
        ADMIN, USER;
    }

    public enum Status {
        PENDING, ACTIVE, INACTIVE;
    }
}