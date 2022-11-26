package com.api.movie.controller;

import java.util.List;

import com.api.movie.dto.InfoDTO;
import com.api.movie.service.InfoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/info/")
public class InfoController {

	private InfoService service;

	public InfoController(InfoService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<InfoDTO> save(@RequestBody InfoDTO infoDto) {
		return service.SaveInfo(infoDto);
	}

	@GetMapping
	public List<InfoDTO> listAll() {
		return service.listAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<InfoDTO> listIdInfo(@PathVariable Long id) {
		return service.listIdInfo(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<InfoDTO> update(@PathVariable Long id, @RequestBody InfoDTO infodto) {
		return service.dataUpdate(id, infodto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<InfoDTO> delete(@PathVariable Long id) {
		return service.deletebase(id);
	}

}
