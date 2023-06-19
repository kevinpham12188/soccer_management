package com.example.soccermanagementpage.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 100)
    private String name;

    @Column
    private Integer age;

    @Column
    private String position;

    @Column
    private String country;

    @Column
    private Integer goals;

    @Column
    private Integer assists;

    @Column
    private Integer cards;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
