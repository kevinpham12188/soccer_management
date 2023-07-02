package com.example.soccermanagementpage.service.impl;

import com.example.soccermanagementpage.entities.User;
import com.example.soccermanagementpage.exception.EntityNotFoundException;
import com.example.soccermanagementpage.repository.UserRepository;
import com.example.soccermanagementpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updatedUser(Long id, User user) {
        User existedUser = userRepository.findById(id).orElse(null);
        if(Objects.isNull(existedUser)) {
            throw new EntityNotFoundException(404, "Entity not existed");
        }
        return userRepository.save(existedUser);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Object deleteTournament(Long id) {
        User existedUser = userRepository.findById(id).orElse(null);
        if(Objects.isNull(existedUser)) {
            return "User not existed";
        }
        return existedUser;
    }
}
