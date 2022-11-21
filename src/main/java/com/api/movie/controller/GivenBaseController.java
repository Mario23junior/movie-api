package com.api.movie.controller;

import java.util.List;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.service.GivenBaseService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/givenbase/")
public class GivenBaseController {

	private GivenBaseService service;

	public GivenBaseController(GivenBaseService service) {
		this.service = service;
	}
	
	
	@PostMapping
	public ResponseEntity<GivenBaseDTO> save(@RequestBody GivenBaseDTO givenBaseDto) {
		return service.savegiven(givenBaseDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<GivenBaseDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@GetMapping()
	public List<GivenBaseDTO> listAll() {
		return service.listAll();
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<GivenBaseDTO> listId(@PathVariable Long id,@RequestBody GivenBaseDTO givenBaseDto) {
		return service.dataUpdate(id, givenBaseDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<GivenBaseDTO> delete(@PathVariable Long id) {
		return service.deletebase(id);
	}
	
	
}