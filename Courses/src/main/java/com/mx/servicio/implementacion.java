package com.mx.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.coursesDao;
import com.mx.entity.courses;
@Service
public class implementacion implements metodos {
	
	@Autowired
	coursesDao dao;
	
	@Override
	public void guardar(courses courses) {
		dao.save(courses);
	}

	@Override
	public courses buscar(courses courses) {
		return dao.findById(courses.getId()).orElse(null);
	}

	@Override
	public void editar(courses courses) {
		dao.save(courses);
		
	}

	@Override
	public void eliminar(courses courses) {
		dao.delete(courses);
		
	}

	@Override
	public List<courses> listar() {
		return (List<courses>) dao.findAll();
	}

}
