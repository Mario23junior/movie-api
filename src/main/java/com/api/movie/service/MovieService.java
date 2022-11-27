package com.api.movie.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.api.movie.dto.MovieDTO;
import com.api.movie.exceptions.ErroExceptionsObjectMessage;
import com.api.movie.model.Movie;
import com.api.movie.repository.MovieRepository;

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
	
	public ResponseEntity<MovieDTO> listId(Long id) {
		Optional<Movie> listId = repository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), MovieDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
	}
	
	public ResponseEntity<MovieDTO> listMovieName(String nameMovie) {
		Optional<Movie> listmovie = repository.findByNomeContainingIgnoreCase(nameMovie);
		if(listmovie.isPresent()) {
			return ResponseEntity.ok(mapper.map(listmovie.get(), MovieDTO.class));
		} else {
			throw new ErroExceptionsObjectMessage("O filme "+ nameMovie 
			+" não foi encontrado ");
		}	
	}
	
	public ResponseEntity<MovieDTO> dataUpdate(Long id, MovieDTO movieDto) {
		Optional<Movie> moviedata = repository.findById(id);
		if(moviedata.isPresent()) {
			Movie movie = moviedata.get();
 			movie.setNome(movieDto.getNome());
 			movie.setDescricao(movieDto.getDescricao());
 			movie.setFavorito(movieDto.getFavorito());
 			movie.setImagem(movieDto.getImagem());
 			movie.setDataLancamento(movieDto.getDataLancamento());
			repository.save(movie);
			return ResponseEntity.ok(mapper.map(movie, MovieDTO.class));	
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<MovieDTO> deletebase(Long id) {
		Optional<Movie> findid = repository.findById(id);
		if(findid.isPresent()) {
			repository.delete(findid.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public void favorito(Long id) {
		Optional<Movie> listId = repository.findById(id);
		 listId.ifPresent( favor -> {
		 boolean favorito = favor.getFavorito() == Boolean.TRUE;
		 favor.setFavorito(!favorito);
		 repository.save(favor);
    	});
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
