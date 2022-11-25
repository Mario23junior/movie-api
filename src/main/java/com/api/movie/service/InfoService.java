package com.api.movie.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public List<InfoDTO> listAll() {
		try {
			List<Info> list = repository.findAll();
			return list
					.stream()
					.map(l -> mapper.map(l, InfoDTO.class))
 					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ErroExceptionsObjectMessage("Erro ao listar informações por favor tente novamente.");
		}
	}
	
	public ResponseEntity<InfoDTO> dataUpdate(Long id, InfoDTO infodto) {
		Optional<Info> infodata = repository.findById(id);
		if(infodata.isPresent()) {
			Info info = infodata.get();
			info.setAno(infodto.getAno());
			info.setAutor(infodto.getAutor());
			info.setElenco(infodto.getElenco());
			info.setGenero(infodto.getGenero());
			repository.save(info);
			return ResponseEntity.ok(mapper.map(info, InfoDTO.class));	
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<InfoDTO> deletebase(Long id) {
		Optional<Info> findid = repository.findById(id);
		if(findid.isPresent()) {
			repository.delete(findid.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<InfoDTO> listIdInfo(Long id) {
		Optional<Info> listId = repository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), InfoDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
	}
	
	

	public void ValidValueDuplicate(InfoDTO infoDto) {
 		Info infodto = mapper.map(infoDto, Info.class);
		Info findinfo = repository.findByElenco(infoDto.getElenco());
		if(findinfo != null && findinfo.getId() != infodto.getId()) {
			throw new ErroExceptionsObjectMessage("As seguintes informações do filme Já esta cadastrado na base,Por favor tente inserir um outro filme.");
		}
	}
}
