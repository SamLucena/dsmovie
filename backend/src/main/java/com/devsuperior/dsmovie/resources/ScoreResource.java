package com.devsuperior.dsmovie.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

@RestController
@RequestMapping(path = "/scores")
public class ScoreResource {	
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		return ResponseEntity.ok(movieDTO);
	}
}
