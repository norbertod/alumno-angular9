package com.formacionbdi.microservicios.app.cursos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

//nombre del servicio con el que nos queremos comunicar
@FeignClient(name = "microservicio-usuarios")
public interface AlumnoFeignClient {

	//debe tener el mismo nombre que en el controlador de alumnos AlumnoController - linea 32
	//el nombre del metodo debe ser igual tambien
	@GetMapping("/alumnos-por-curso")
	public Iterable<Alumno> obtenerAlumnosPorCurso(@RequestParam Iterable<Long> ids);
}
