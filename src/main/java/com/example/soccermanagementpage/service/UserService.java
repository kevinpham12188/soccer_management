package com.example.soccermanagementpage.service;

import com.example.soccermanagementpage.entities.User;

import java.util.List;

public interface UserService {
    List getAllUsers();

    User createUser(User user);

    User updatedUser(Long id, User user);

    User getUserById(Long id);

    Object deleteTournament(Long id);
}
