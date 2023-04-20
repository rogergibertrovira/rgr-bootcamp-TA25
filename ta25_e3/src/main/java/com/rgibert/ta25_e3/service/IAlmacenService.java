package com.rgibert.ta25_e3.service;

import java.util.List;

import com.rgibert.ta25_e3.dto.Almacen;

public interface IAlmacenService {
	
	public List<Almacen> listarAlmacenes(); // Listar All

	public Almacen guardarAlmacen(Almacen almacen); // Guarda un almacen CREATE

	public Almacen almacenXID(int id); // Leer datos de un almacen READ

	public Almacen actualizarAlmacen(Almacen almacen); // Actualiza datos del almacen UPDATE

	public void eliminarAlmacen(int id);// Elimina el almacen DELETE
}
