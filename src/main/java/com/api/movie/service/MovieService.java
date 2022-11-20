package com.api.movie.service;

import java.util.List;
import java.util.stream.Collectors;

import com.api.movie.MovieRepository;
import com.api.movie.dto.MovieDTO;
import com.api.movie.exceptions.ErroExceptionsObjectMessage;
import com.api.movie.model.Movie;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private ModelMapper mapper;
	private MovieRepository repository;

	public MovieService(MovieRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public List<MovieDTO> listAll() throws Exception {
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
}
