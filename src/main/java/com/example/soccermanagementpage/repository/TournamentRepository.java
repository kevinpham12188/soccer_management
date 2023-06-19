package com.example.soccermanagementpage.repository;

import com.example.soccermanagementpage.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
