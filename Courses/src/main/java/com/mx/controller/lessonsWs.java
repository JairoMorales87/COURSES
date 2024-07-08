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
import com.mx.entity.lessons;
import com.mx.servicio.implementacion;
import com.mx.servicio.implementacion2;

@RestController
@RequestMapping(path = "coursesWs")
@CrossOrigin("*")
public class lessonsWs {
	
	@Autowired
	implementacion2 imp;
	
	// http://localhost:9000/lessonsWs/listar
			@GetMapping("listar")
			public List<lessons> listar() {
				return imp.listar();
			}


			// http://localhost:9000/lessonsWs/buscar
			@PostMapping("buscar")
			public lessons buscar(@RequestBody lessons lessons) {
				return imp.buscar(lessons);

			}
			
			// http://localhost:9000/lessonsWs/guardar
			@PostMapping("guardar")
			public void guardar(@RequestBody lessons lessons) {
				imp.guardar(lessons);

			}

			// http://localhost:9000/lessonsWs/editar
			@PostMapping("editar")
			public void editar(@RequestBody lessons lessons) {
				imp.editar(lessons);

			}
			// http://localhost:9000/lessonsWs/eliminar
			@PostMapping("eliminar")
			public void eliminar(@RequestBody lessons lessons) {
				imp.eliminar(lessons);

			}
}
