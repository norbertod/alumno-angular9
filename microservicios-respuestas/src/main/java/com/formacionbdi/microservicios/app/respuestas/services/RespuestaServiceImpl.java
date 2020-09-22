package com.formacionbdi.microservicios.app.respuestas.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.microservicios.app.respuestas.clients.ExamenFeignClient;
import com.formacionbdi.microservicios.app.respuestas.models.entity.Respuesta;
import com.formacionbdi.microservicios.app.respuestas.models.repository.RespuestaRepository;
//import com.formacionbdi.microservicios.commons.examenes.models.entity.Examen;
//import com.formacionbdi.microservicios.commons.examenes.models.entity.Pregunta;

@Service
public class RespuestaServiceImpl implements RespuestaService {
	
	@Autowired
	private RespuestaRepository repository;
	
	@Autowired
	private ExamenFeignClient examenClient;

	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {

		return repository.saveAll(respuestas);
	}

	@Override
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId) {
		/*
		//buscar el examen por su id en el microservicio examenes que trabaja con MYSQL
		Examen examen = examenClient.obtenerExamenPorId(examenId);
		//del examen obtenido saco las preguntas
		List<Pregunta> preguntas = examen.getPreguntas();
		//de estas preguntas obtenidas saco los IDs de las mismas
		List<Long> preguntaIds = preguntas.stream().map(p -> p.getId()).collect(Collectors.toList());
		//obtengo las respuestas del alumnoID mas los id de las preguntas obtenidas en la linea de arriba
		List<Respuesta> respuestas = (List<Respuesta>) repository.findRespuestaByAlumnoByPreguntaIds(alumnoId, preguntaIds);
		//por cada respuesta
		respuestas = respuestas.stream().map(r ->{
			//por cada pregunta en preguntas que tenga el mismo id que la pregunta asociada a la respuesta
			//se asigna a la respuesta el objeto completo pregunta
			preguntas.forEach(p ->{
				if(p.getId() == r.getPreguntaId()) {
					r.setPregunta(p);
				}
			});
			return r;
		}).collect(Collectors.toList());*/
				
		List<Respuesta> respuestas = (List<Respuesta>) repository.findRespuestaByAlumnoByExamen(alumnoId, examenId);
		return respuestas;
	}

	@Override
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId) {
		/*List<Respuesta> respuestasAlumno = (List<Respuesta>) repository.findByAlumnoId(alumnoId);
		List<Long> examenIds = Collections.emptyList();
		
		//si el alumno tiene respuesta
		if(respuestasAlumno.size() > 0) {
			//obtiene todas las pretuntas de las repuestas del alumno
		  List<Long> preguntaIds = respuestasAlumno.stream().map(r -> r.getPreguntaId()).collect(Collectors.toList());
		  //obtiene la lista de id de examens con respuestas
		  examenIds = examenClient.obtenerExamenesIdsPorPreguntasIdRespondidas(preguntaIds);
		}
		
		return examenIds;*/
		
		List<Respuesta> respuestasAlumno = (List<Respuesta>) repository.findExamenesIdsConRespuestasByAlumno(alumnoId);
		List<Long> examenIds = respuestasAlumno
				.stream()
				.map(r -> r.getPregunta().getExamen().getId())
				.distinct()
				.collect(Collectors.toList());
		
		return examenIds;
		
		
	}

	@Override
	public Iterable<Respuesta> findByAlumnoId(Long alumnoId) {
		return repository.findByAlumnoId(alumnoId);
	}
	
}
