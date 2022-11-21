package com.api.movie.utils;

import java.util.Arrays;

import com.api.movie.MovieRepository;
import com.api.movie.dto.MovieDTO;
import com.api.movie.model.Movie;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class cargaBaseMovie {
 
	private MovieRepository repository;
	private ModelMapper mapper;
	
	public cargaBaseMovie( MovieRepository repository,ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
 	}
	
	public void cargaService() {
		MovieDTO m1 = new MovieDTO();
		m1.setId(1l);
		m1.setNome("Rango");
		m1.setImagem("https://mb.web.sapo.io/f711101a8d3b5c895bfef0cc3dcb44e4909077d8.jpg");
		m1.setDataLancamento("09-03-2022");
		m1.setFavorito(false);
		m1.setDescricao("A história da aventura de Rango, um camaleão de cativeiro que vive uma normal vida de animal de estimação, enquanto enfrenta uma enorme crise de identidade. A final de contas, de que serve sonhar alto se sabemos que o nosso propósito na vida é nos diluirmos? Quando acidentalmente Rango se vê na arenosa e 'nervosa' Vila Poeira – um lugar sem lei, habitado pelas criaturas mais astutas e extravagantes do deserto – o pouco corajoso lagarto descobre rapidamente que se distingue dos outros.");
		
		MovieDTO m1d = mapper.map(m1, MovieDTO.class);
		repository.saveAll(Arrays.asList(mapper.map(m1d, Movie.class)));
	}
}
