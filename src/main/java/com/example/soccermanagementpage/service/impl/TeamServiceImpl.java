package com.example.soccermanagementpage.service.impl;

import com.example.soccermanagementpage.entities.Team;
import com.example.soccermanagementpage.exception.EntityNotFoundException;
import com.example.soccermanagementpage.repository.TeamRepository;
import com.example.soccermanagementpage.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;


    @Override
    public List getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updatTeam(Long id, Team team) {
        Team teamExist = teamRepository.findById(id).orElse(null);
        if(Objects.isNull(teamExist)) {
            throw new EntityNotFoundException(404, "Entity not existed");
        }
        return teamRepository.save(team);
    }

    @Override
    public Team getTeamById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    @Override
    public Object deleteTeam(Long id) {
        Team teamExisted = teamRepository.findById(id).orElse(null);

        if (Objects.isNull(teamExisted)){
            return "Team not existed";
        }
        teamRepository.deleteById(id);
        return teamExisted;
    }
}
