package com.mx.servicio;

import java.util.List;

import com.mx.entity.courses;


public interface metodos {

public void guardar(courses courses);
	
	public courses buscar(courses courses);

	public void editar(courses courses);

	public void eliminar(courses courses);

	public List<courses> listar();
}
