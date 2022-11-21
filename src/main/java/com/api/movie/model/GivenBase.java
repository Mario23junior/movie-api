package com.api.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GivenBase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String emissora;
	private String urlTrilerVideo;
	private String direcao;
	private String tipo;

	public GivenBase() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmissora() {
		return emissora;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	public String getUrlTrilerVideo() {
		return urlTrilerVideo;
	}

	public void setUrlTrilerVideo(String urlTrilerVideo) {
		this.urlTrilerVideo = urlTrilerVideo;
	}

	 

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
