package com.api.movie.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.api.movie.dto.GivenBaseDTO;
import com.api.movie.exceptions.ErroExceptionsObjectMessage;
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
	
	public List<GivenBaseDTO> listAll() {
		try {
			List<GivenBase> list = repository.findAll();
			return list
					.stream()
					.map(l -> mapper.map(l, GivenBaseDTO.class))
 					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ErroExceptionsObjectMessage("Informações não encontradas por favor tente novamente.");
		}
	}
	
	
	public ResponseEntity<GivenBaseDTO> listId(Long id) {
		Optional<GivenBase> listId = repository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), GivenBaseDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
	}
	
	public ResponseEntity<GivenBaseDTO> dataUpdate(Long id, GivenBaseDTO givenBaseDto) {
		Optional<GivenBase> givenbase = repository.findById(id);
		if(givenbase.isPresent()) {
			GivenBase given = givenbase.get();
			given.setDirecao(givenBaseDto.getDirecao());
			given.setEmissora(givenBaseDto.getEmissora());
			given.setTipo(givenBaseDto.getTipo());
			given.setUrlTrilerVideo(givenBaseDto.getUrlTrilerVideo());
			repository.save(given);
			return ResponseEntity.ok(mapper.map(given, GivenBaseDTO.class));	
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	

public ResponseEntity<GivenBaseDTO> deletebase(Long id) {
	Optional<GivenBase> findid = repository.findById(id);
	if(findid.isPresent()) {
		repository.delete(findid.get());
		return new ResponseEntity<>(HttpStatus.OK);
	}else {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
	
}














