package com.example.soccermanagementpage.controller;

import com.example.soccermanagementpage.entities.Player;
import com.example.soccermanagementpage.service.PlayerService;
import com.example.soccermanagementpage.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping(value = "/players")
    public ResponseEntity<List<Player>> getAllPlayer(){
        List players = playerService.getAllPlayer();
        if (Utils.isListNull(players)){
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(players);
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        Player newPlayer = playerService.createPlayer(player);
        return newPlayer;
    }



}
