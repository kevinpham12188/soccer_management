package com.example.soccermanagementpage.service.impl;

import com.example.soccermanagementpage.entities.Player;
import com.example.soccermanagementpage.repository.PlayerRepository;
import com.example.soccermanagementpage.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List getAllPlayer() {
        return null;
    }

    @Override
    public Player createPlayer(Player player) {
        return null;
    }
}
