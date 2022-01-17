package com.educandoweb.cursofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursofullstack.entities.Game;

public interface RecordRepository extends JpaRepository<Game, Long> {

}
