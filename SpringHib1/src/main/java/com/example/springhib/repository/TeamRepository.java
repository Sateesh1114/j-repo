package com.example.springhib.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springhib.model.Team;
@Repository
@Transactional
public interface TeamRepository extends JpaRepository<Team, Long> {
	Team findByPlayers(long playerId);

}
