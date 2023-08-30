package br.com.melgaco.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.melgaco.dto.ConstrutoraDTO;
import br.com.melgaco.service.ConstrutoraService;


@RestController 
@RequestMapping(value = "/construtora")
public class ConstrutoraControle {
	
	@Autowired
	private ConstrutoraService service;
	
	@GetMapping()
	public List<ConstrutoraDTO> getAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ConstrutoraDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
}
