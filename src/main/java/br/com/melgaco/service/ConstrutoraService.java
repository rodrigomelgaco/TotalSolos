package br.com.melgaco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.melgaco.dto.ConstrutoraDTO;
import br.com.melgaco.model.Construtora;
import br.com.melgaco.repositorio.ConstrutoraRepositorio;

@Service
public class ConstrutoraService {

	@Autowired
	private ConstrutoraRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<ConstrutoraDTO> findAll(){
		List<Construtora> construtoras = repositorio.findAll();
		
		return construtoras.stream().map(x-> new ConstrutoraDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public ConstrutoraDTO findById(Long id) {
		return new ConstrutoraDTO(repositorio.findById(id).get());
	}
}
