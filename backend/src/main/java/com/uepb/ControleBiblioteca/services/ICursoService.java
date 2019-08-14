package com.uepb.ControleBiblioteca.services;

import java.util.List;
import java.util.Optional;

import com.uepb.ControleBiblioteca.entities.Curso;

public interface ICursoService {
	
	List<Curso> findAll();
	Optional<Curso> findOne(Long id);
	Curso create(Curso curso);
	Curso update(Curso curso, Long Id);
	public void remove(Long id);

}
