package com.api.movie.service;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.model.GivenBase;
import com.api.movie.repository.GivenBaseRepository;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GivenBaseService {
  
	private ModelMapper mapper;
	private GivenBaseRepository repository;

	public GivenBaseService(GivenBaseRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}
	
	public ResponseEntity<GivenBaseDTO> savegiven (GivenBaseDTO givenBaseDto) {
		GivenBase tele = bodysave(mapper.map(givenBaseDto, GivenBase.class));
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(mapper.map(tele, GivenBaseDTO.class));
	
}

	public GivenBase bodysave(GivenBase givenBase) {
		return this.repository.save(givenBase);
	}
}
