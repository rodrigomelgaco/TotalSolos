package br.com.melgaco.dto;

import br.com.melgaco.model.Obra;

public record ObraDTO(long id, String local, String nomeConstrutora) {
	public ObraDTO (long id, String local, String nomeConstrutora) {
		this.id=id;
		this.local = local;
		this.nomeConstrutora=nomeConstrutora;
	}
	public ObraDTO(Obra obra) {
		this(obra.getId(),obra.getLocal(),obra.getConstrutora().getNome());
	}
}
