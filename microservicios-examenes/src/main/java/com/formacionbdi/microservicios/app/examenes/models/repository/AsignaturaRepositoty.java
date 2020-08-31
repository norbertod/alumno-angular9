package com.formacionbdi.microservicios.app.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepositoty extends CrudRepository<Asignatura, Long>{
	
	

}
