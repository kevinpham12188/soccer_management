package com.example.soccermanagementpage.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String avatarPath;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String role;

    @OneToOne(mappedBy = "user")
    private Player player;
}
