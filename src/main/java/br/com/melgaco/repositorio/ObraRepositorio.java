package br.com.melgaco.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import br.com.melgaco.model.Obra;

public interface ObraRepositorio extends JpaRepository<Obra, Long> {
	@Query(value= "select obj from Obra obj join fetch obj.construtora")
	List<Obra> searchAll();
}
