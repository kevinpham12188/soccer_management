package com.example.soccermanagementpage.repository;

import com.example.soccermanagementpage.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
