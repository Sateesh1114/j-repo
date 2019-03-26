package com.example.springhib.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springhib.model.Player;

@Repository
@Transactional
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(long teamId);

}
