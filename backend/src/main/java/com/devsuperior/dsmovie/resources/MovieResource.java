package com.devsuperior.dsmovie.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(path = "/movies")
public class MovieResource {

	@Autowired
	public MovieService service;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable){
		Page<MovieDTO> page = service.findAll(pageable);
		return ResponseEntity.ok(page); 
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id){
		MovieDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}
}