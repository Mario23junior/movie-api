package com.api.movie.dto;

import java.util.Date;

 public class MovieDTO {

  	private Long id;
	private String nome;
	private String imagem;
	private String descricao;
	private Boolean favorit;
	private Date dataLancamento;
	
	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getFavorit() {
		return favorit;
	}

	public void setFavorit(Boolean favorit) {
		this.favorit = favorit;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

}
