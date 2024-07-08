package com.mx.servicio;

import java.util.List;

import com.mx.entity.lessons;



public interface metodos2 {
	public lessons buscar(lessons lessons);
	
	public void guardar(lessons lessons);

	public void editar(lessons lessons);

	public void eliminar(lessons lessons);

	public List<lessons> listar();
}
