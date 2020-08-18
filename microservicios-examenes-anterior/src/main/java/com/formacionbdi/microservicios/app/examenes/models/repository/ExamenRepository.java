package com.formacionbdi.microservicios.app.examenes.models.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.formacionbdi.microservicios.app.examenes.models.entity.Examen;

public interface ExamenRepository extends PagingAndSortingRepository<Examen, Long>{

}
