package com.example.soccermanagementpage.repository;

import com.example.soccermanagementpage.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
