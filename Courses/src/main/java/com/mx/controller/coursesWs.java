package com.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.entity.courses;
import com.mx.servicio.implementacion;

@RestController
@RequestMapping(path = "lessonsWs")
@CrossOrigin("*")
public class coursesWs {
	
	@Autowired
	implementacion imp;
	
	// http://localhost:9000/coursesWs/listar
		@GetMapping("listar")
		public List<courses> listar() {
			return imp.listar();
		}


		// http://localhost:9000/AlumnoWs/buscar
		@PostMapping("buscar")
		public courses buscar(@RequestBody courses courses) {
			return imp.buscar(courses);

		}
		
		// http://localhost:9000/coursesWs/guardar
		@PostMapping("guardar")
		public void guardar(@RequestBody courses courses) {
			imp.guardar(courses);

		}

		// http://localhost:9000/coursesWs/editar
		@PostMapping("editar")
		public void editar(@RequestBody courses courses) {
			imp.editar(courses);

		}
		
		// http://localhost:9000/coursesWs/eliminar
		@PostMapping("eliminar")
		public void eliminar(@RequestBody courses courses) {
			imp.eliminar(courses);

		}
		
	
}
