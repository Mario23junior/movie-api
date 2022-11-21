package com.api.movie.controller;

import java.util.List;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.service.GivenBaseService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping
	public List<GivenBaseDTO> listAll() {
		return service.listAll();
	}
	
	
}