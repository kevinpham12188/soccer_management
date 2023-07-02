package com.example.soccermanagementpage.service;

import com.example.soccermanagementpage.entities.Team;

import java.util.List;

public interface TeamService {

    List getAllTeams();

    Team createTeam(Team team);

    Team updatTeam(Long id, Team team);

    Team getTeamById(Long id);

    Object deleteTeam(Long id);
}
