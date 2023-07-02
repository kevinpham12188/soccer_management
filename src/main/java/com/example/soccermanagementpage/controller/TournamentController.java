package com.example.soccermanagementpage.controller;

import com.example.soccermanagementpage.entities.Tournament;
import com.example.soccermanagementpage.repository.TournamentRepository;
import com.example.soccermanagementpage.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tournament")
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Tournament>> getAllTournament() {
        List tournaments = tournamentService.getAllTournaments();
        return ResponseEntity.ok(tournaments);
    }

    @PostMapping(value = {"", "/"})
    public Tournament createTournament(@RequestBody Tournament tournament) {
        Tournament newTournament = tournamentService.createTournament(tournament);
        return newTournament;
    }

    @PutMapping(value = "/{idTournament}")
    public Tournament updateTournament(@PathVariable Long idTournament, @RequestBody Tournament tournament) {
        Tournament updatedTournament = tournamentService.updateTournament(idTournament, tournament);
        return updatedTournament;
    }

    @GetMapping(value = "/{id}")
    public Tournament getTournamentById(@PathVariable Long id) {
        Tournament tournamentById = tournamentService.getTournamentById(id);
        return tournamentById;
    }

    @DeleteMapping(value = "/{id}")
    public Object deleteTournament(@PathVariable Long id) {
        Object deleteTournament = tournamentService.deleteTournament(id);
        return deleteTournament;
    }

}
