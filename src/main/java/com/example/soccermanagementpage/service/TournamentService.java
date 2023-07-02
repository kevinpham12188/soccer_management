package com.example.soccermanagementpage.service;

import com.example.soccermanagementpage.entities.Tournament;

import java.util.List;

public interface TournamentService {

    List getAllTournaments();

    Tournament createTournament(Tournament tournament);

    Tournament updateTournament(Long id, Tournament tournament);

    Tournament getTournamentById(Long id);

    Object deleteTournament(Long id);
}
