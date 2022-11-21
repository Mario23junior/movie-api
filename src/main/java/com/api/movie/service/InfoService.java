package com.api.movie.service;

import com.api.movie.dto.InfoDTO;
import com.api.movie.exceptions.ErroExceptionsObjectMessage;
import com.api.movie.model.Info;
import com.api.movie.repository.InfoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
  
	private ModelMapper mapper;
	private InfoRepository repository;

	public InfoService(InfoRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}
	
	public ResponseEntity<InfoDTO> SaveInfo (InfoDTO infoDto) {
  			ValidValueDuplicate(infoDto);
			Info tele = bodysave(mapper.map(infoDto, Info.class));
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(mapper.map(tele, InfoDTO.class));
		
	}
	
	public Info bodysave(Info info) {
		return this.repository.save(info);
	}
	

	public void ValidValueDuplicate(InfoDTO infoDto) {
 		Info infodto = mapper.map(infoDto, Info.class);
		Info findinfo = repository.findByElenco(infoDto.getElenco());
		if(findinfo != null && findinfo.getId() != infodto.getId()) {
			throw new ErroExceptionsObjectMessage("As seguintes informações do filme Já esta cadastrado na base,Por favor tente inserir um outro filme.");
		}
	}
}
