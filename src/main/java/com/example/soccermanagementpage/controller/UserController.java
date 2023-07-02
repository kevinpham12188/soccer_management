package com.example.soccermanagementpage.controller;

import com.example.soccermanagementpage.entities.User;
import com.example.soccermanagementpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<User>> getAllUsers() {
        List users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping(value = {"", "/"})
    public User createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return newUser;
    }

    @PutMapping(value = "/{idUser}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updatedUser(id, user);
        return updatedUser;
    }


    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id) {
        User userById = userService.getUserById(id);
        return userById;
    }

    @DeleteMapping(value = "/{id}")
    public Object deleteTournament(@PathVariable Long id) {
        Object deleteTournament = userService.deleteTournament(id);
        return deleteTournament;
    }
}
