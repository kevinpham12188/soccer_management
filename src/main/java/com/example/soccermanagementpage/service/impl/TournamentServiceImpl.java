package com.example.soccermanagementpage.service.impl;

import com.example.soccermanagementpage.entities.Tournament;
import com.example.soccermanagementpage.exception.EntityNotFoundException;
import com.example.soccermanagementpage.repository.TournamentRepository;
import com.example.soccermanagementpage.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TournamentServiceImpl implements TournamentService {


    @Autowired
    private TournamentRepository tournamentRepository;

    @Override
    public List getAllTournaments() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament updateTournament(Long id, Tournament tournament) {
        Tournament existedTournament = tournamentRepository.findById(id).orElse(null);
        if(Objects.isNull(existedTournament)) {
            throw new EntityNotFoundException(404, "Entity not existed");
        }
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament getTournamentById(Long id) {
        return tournamentRepository.findById(id).orElse(null);
    }

    @Override
    public Object deleteTournament(Long id) {
        Tournament existedTournament = tournamentRepository.findById(id).orElse(null);
        if(Objects.isNull(existedTournament)) {
            throw new EntityNotFoundException(404, "Entity not existed");
        }
        tournamentRepository.deleteById(id);
        return existedTournament;
    }
}
