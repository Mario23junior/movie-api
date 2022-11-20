package com.api.movie.service;

import java.util.List;
import java.util.stream.Collectors;

import com.api.movie.MovieRepository;
import com.api.movie.dto.MovieDTO;
import com.api.movie.exceptions.ErroExceptionsObjectMessage;
import com.api.movie.model.Movie;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private ModelMapper mapper;
	private MovieRepository repository;

	public MovieService(MovieRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public List<MovieDTO> listAll() {
		try {
			List<Movie> list = repository.findAll();
			return list
					.stream()
					.map(l -> mapper.map(l, MovieDTO.class))
 					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ErroExceptionsObjectMessage("Erro ao listar dados por favor tente novamente.");
		}
	}
	
	public ResponseEntity<MovieDTO> savestruturaObser (MovieDTO movieDto) {
		ValidValueDuplicate(movieDto);
		Movie tele = bodysave(mapper.map(movieDto, Movie.class));
		return ResponseEntity
				  .status(HttpStatus.OK)
				  .body(mapper.map(tele, MovieDTO.class));
	}
	
	public Movie bodysave(Movie movie) {
		return this.repository.save(movie);
	}
	
	
	public void ValidValueDuplicate(MovieDTO movieDto) {
		Movie moviedto = mapper.map(movieDto, Movie.class);
		Movie findmovie = repository.findByNome(movieDto.getNome());
		if(findmovie != null && findmovie.getId() != moviedto.getId()) {
			throw new ErroExceptionsObjectMessage("O filme "+ findmovie.getNome() 
			+" Já esta cadastrado na base, tente inserir um outro filme.");
		}
	}
	
}
























