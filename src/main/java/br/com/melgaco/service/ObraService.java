package br.com.melgaco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.melgaco.dto.ObraDTO;
import br.com.melgaco.model.Obra;
import br.com.melgaco.repositorio.ObraRepositorio;

@Service
public class ObraService {

	@Autowired
	private ObraRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<ObraDTO> findAll(){
		List<Obra> obras = repositorio.searchAll();
		return obras.stream().map(x-> new ObraDTO(x)).toList();
	}
}
