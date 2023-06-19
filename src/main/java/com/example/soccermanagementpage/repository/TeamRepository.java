package com.example.soccermanagementpage.repository;

import com.example.soccermanagementpage.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
