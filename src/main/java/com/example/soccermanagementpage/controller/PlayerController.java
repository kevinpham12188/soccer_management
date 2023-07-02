package com.example.soccermanagementpage.controller;

import com.example.soccermanagementpage.entities.Player;
import com.example.soccermanagementpage.exception.BusinessException;
import com.example.soccermanagementpage.service.PlayerService;
import com.example.soccermanagementpage.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;


    /**
     *
     * @return
     */
    @GetMapping(value = "/players")
    public ResponseEntity<List<Player>> getAllPlayer(){

        // Get all player
        List players = playerService.getAllPlayer();
        if (Utils.isListNull(players)){
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(players);
    }

//    Create Player
    @PostMapping("/player")
    public Player createPlayer(@RequestBody Player player) {
        Player newPlayer = playerService.createPlayer(player);
        return newPlayer;
    }

    @PutMapping("/player/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        Player updatePlayer = playerService.updatePlayer(id, player);
        return ResponseEntity.ok(updatePlayer);
    }

    @GetMapping("/player/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        Player player= playerService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }

    @DeleteMapping("/player/{id}")
    public ResponseEntity<Player> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/playersByName")
    public  ResponseEntity<List<Player>> findByPlayerName(@RequestParam(name = "playerName", defaultValue = "") String keySearch){
        System.out.printf("Hello");


        throw new BusinessException("this is businessexception");

//        List<Player> players = playerService.findByPlayerName(keySearch);
//
//        List<String>  collect = players.stream().map(Player::getName).collect(Collectors.toList());
//
//        players.stream().filter(player -> player.getAge() > 18).collect(Collectors.toList());
//        return  ResponseEntity.ok(players);
    }

}
