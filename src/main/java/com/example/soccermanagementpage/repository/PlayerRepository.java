package com.example.soccermanagementpage.repository;

import com.example.soccermanagementpage.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
// Function Query
        List<Player> findByNameContainingIgnoreCase(String keySearch);

//Native Query
//    @Query( value= "Select * from player where upper(name) like  :keysearch", nativeQuery = true)
//    List<Player> getAllByNameContain(String keySearch);
}
