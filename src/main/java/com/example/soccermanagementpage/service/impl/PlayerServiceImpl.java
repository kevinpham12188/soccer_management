package com.example.soccermanagementpage.service.impl;

import com.example.soccermanagementpage.entities.Player;
import com.example.soccermanagementpage.entities.Team;
import com.example.soccermanagementpage.exception.EntityNotFoundException;
import com.example.soccermanagementpage.repository.PlayerRepository;
import com.example.soccermanagementpage.service.PlayerService;
import org.springframework.beans.factory.FactoryBeanNotInitializedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List getAllPlayer() {
        return playerRepository.findAll();
    }

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(Long id, Player player) {
        Player playerExist  = playerRepository.findById(id).orElse(null);
        if(Objects.isNull(playerExist)) {
            throw new EntityNotFoundException(404, "Entity not existed");
        }
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Long id) {
        Player player = playerRepository.findById(id).orElse(null);
        if(Objects.isNull(player)) {
            throw new EntityNotFoundException(404, "Player not existed");
        }
        return player;

    }

    @Override
    public void deletePlayer(Long id) {
        try {
            playerRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Player> findByPlayerName(String keySearch) {
        List<Player> players = playerRepository.findByNameContainingIgnoreCase(keySearch);
        return players;
    }
}
