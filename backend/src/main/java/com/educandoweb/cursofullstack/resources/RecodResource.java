package com.educandoweb.cursofullstack.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.cursofullstack.dto.RecordDTO;
import com.educandoweb.cursofullstack.dto.RecordInsertDTO;
import com.educandoweb.cursofullstack.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecodResource {
	
	@Autowired
	private RecordService service;
	
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	
	}

}
