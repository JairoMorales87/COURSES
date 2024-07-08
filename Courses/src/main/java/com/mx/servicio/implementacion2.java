package com.mx.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.lessonsDao;
import com.mx.entity.lessons;

@Service
public class implementacion2 implements metodos2{

	@Autowired
	lessonsDao dao;

	@Override
	public lessons buscar(lessons lessons) {
		return dao.findById(lessons.getId()).orElse(null);
	}

	@Override
	public void guardar(lessons lessons) {
		dao.save(lessons);
		
	}

	@Override
	public void editar(lessons lessons) {
		dao.save(lessons);
		
	}

	@Override
	public void eliminar(lessons lessons) {
		dao.delete(lessons);
		
	}

	@Override
	public List<lessons> listar() {
		return (List<lessons>) dao.findAll();
	}
	
	
	
	
	

}
