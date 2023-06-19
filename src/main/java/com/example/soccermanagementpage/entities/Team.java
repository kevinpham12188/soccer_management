package com.example.soccermanagementpage.entities;
import jakarta.persistence.*;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;


import java.util.List;
import java.util.Set;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String country;

    @Column
    private String coach;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Player> players;

    @Column
    private String owner;

    @ManyToMany()
    @JoinTable(name = "team_tournament", joinColumns = @JoinColumn(name = "team_id"), inverseJoinColumns = @JoinColumn
            (name = "tournament_id")) //Dinh nghia quan he
    private Set<Tournament> tournaments;

}
