package com.formacionbdi.microservicios.app.cursos.services;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.cursos.models.entity.Curso;
import com.formacionbdi.microservicios.app.cursos.models.repository.CursoRepository;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImp extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByCursoId(Long id) {
		return repository.findCursoByCursoId(id);
	}


}
