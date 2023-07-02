package com.example.soccermanagementpage.controller;

import com.example.soccermanagementpage.entities.Team;
import com.example.soccermanagementpage.repository.TeamRepository;
import com.example.soccermanagementpage.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Team>> getAllTeams() {
        List teams = teamService.getAllTeams();
        return ResponseEntity.ok(teams);
    }

    @PostMapping(value = {"", "/"})
    public Team createTeam(@RequestBody Team team) {
        Team newTeam = teamService.createTeam(team);
        return newTeam;
    }

    @PutMapping(value = "/{idTeam}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team team) {
        Team updatedTeam = teamService.updatTeam(id, team);
        return updatedTeam;
    }

    @GetMapping(value = "/{id}")
    public Team getTeamById(@PathVariable Long id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }

    @DeleteMapping(value = "/{id}")
    public Object deleteTeam(@PathVariable Long id) {
        Object deleteTeam = teamService.deleteTeam(id);
        return deleteTeam;
    }
}
