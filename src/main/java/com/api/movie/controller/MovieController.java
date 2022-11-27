package com.api.movie.controller;

import java.util.List;

import com.api.movie.dto.MovieDTO;
import com.api.movie.service.MovieService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/movie/")
public class MovieController {

	private MovieService service;

	public MovieController(MovieService service) {
		this.service = service;
	}

	@GetMapping
	public List<MovieDTO> listAll() throws Exception {
		return service.listAll();
	}

	@PostMapping
	public ResponseEntity<MovieDTO> save(@RequestBody MovieDTO movieDto) {
		return service.savestruturaObser(movieDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<MovieDTO> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@GetMapping("name")
	public ResponseEntity<MovieDTO> listName(@RequestParam String moviename) {
		return service.listMovieName(moviename);
	}
	
	@PatchMapping("{id}/favorito")
	public void favorito(@PathVariable Long id) {
		service.favorito(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<MovieDTO> update(@PathVariable Long id, @RequestBody MovieDTO movieDto) {
		return service.dataUpdate(id, movieDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<MovieDTO> delete(@PathVariable Long id) {
		return service.deletebase(id);
	}
}
