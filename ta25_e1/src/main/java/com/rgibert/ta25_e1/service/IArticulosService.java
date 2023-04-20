package com.rgibert.ta25_e1.service;

import java.util.List;

import com.rgibert.ta25_e1.dto.Articulo;

public interface IArticulosService {

	// Metodos del CRUD
	public List<Articulo> listarArticulos(); // Listar All

	public Articulo guardarArticulo(Articulo empleado); // Guarda un articulo CREATE

	public Articulo articuloXID(int id); // Leer datos de un articulo READ

	public Articulo actualizarArticulo(Articulo empleado); // Actualiza datos del articulo UPDATE

	public void eliminarArticulo(int id);// Elimina el articulo DELETE
}
