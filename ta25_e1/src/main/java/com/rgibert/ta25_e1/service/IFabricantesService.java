package com.rgibert.ta25_e1.service;

import java.util.List;

import com.rgibert.ta25_e1.dto.Fabricante;

public interface IFabricantesService {

	// Metodos del CRUD
	public List<Fabricante> listarFabricantes(); // Listar All

	public Fabricante guardarFabricante(Fabricante empleado); // Guarda un fabricante CREATE

	public Fabricante fabricanteXID(int id); // Leer datos de un fabricante READ

	public Fabricante actualizarFabricante(Fabricante empleado); // Actualiza datos del fabricante UPDATE

	public void eliminarFabricante(int id);// Elimina el fabricante DELETE
}
