package com.educandoweb.cursofullstack.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoweb.cursofullstack.dto.RecordDTO;
import com.educandoweb.cursofullstack.dto.RecordInsertDTO;
import com.educandoweb.cursofullstack.entities.Game;
import com.educandoweb.cursofullstack.entities.Record;
import com.educandoweb.cursofullstack.repositories.GameRepository;
import com.educandoweb.cursofullstack.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getById(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
		
	
	
	}

}
