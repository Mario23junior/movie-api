package com.api.movie.controller;

import java.util.List;

import com.api.movie.dto.MovieDTO;
import com.api.movie.service.MovieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie/")
public class MovieController {

	private MovieService service;

	public MovieController(MovieService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<MovieDTO> listAll() throws Exception{
		return service.listAll();
	}
}
