package br.com.melgaco.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.melgaco.dto.ObraDTO;
import br.com.melgaco.service.ObraService;

@RestController 
@RequestMapping(value = "/obra")
public class ObraControle {
	
	@Autowired
	private ObraService service;
	
	@GetMapping()
	public List<ObraDTO> getAll(){
		return service.findAll();
	}

}
