package com.example.soccermanagementpage.service;

import com.example.soccermanagementpage.entities.Player;
import com.example.soccermanagementpage.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PlayerService {
    List getAllPlayer();

    Player createPlayer(Player player);
}
