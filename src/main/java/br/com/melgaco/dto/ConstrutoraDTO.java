package br.com.melgaco.dto;

import br.com.melgaco.model.Construtora;

public record ConstrutoraDTO(Long id, String nome, String responsavel) {
	public ConstrutoraDTO(Long id, String nome, String responsavel) {
		this.id=id;
		this.nome=nome;
		this.responsavel=responsavel;
	}
	
	public ConstrutoraDTO (Construtora c) {
		this(c.getId(),c.getNome(),c.getResponsavel());
	}
}
