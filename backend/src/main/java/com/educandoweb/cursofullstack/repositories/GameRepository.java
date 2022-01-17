package com.educandoweb.cursofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.cursofullstack.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
