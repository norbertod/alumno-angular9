package com.formacionbdi.microservicios.app.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// sin esta configuracion no funciona mongodb
//YA que hay dependencias en el pom que usan JPA
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
//se borro el entity scan ya que no son mas entidades sino documentos
public class MicroserviciosRespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRespuestasApplication.class, args); //hola
	}

}
