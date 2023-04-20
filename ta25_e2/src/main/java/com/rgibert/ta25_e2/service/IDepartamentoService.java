package com.rgibert.ta25_e2.service;

import java.util.List;

import com.rgibert.ta25_e2.dto.Departamento;

public interface IDepartamentoService {

	public List<Departamento> listarDepartamentos(); // Listar All

	public Departamento guardarDepartamento(Departamento departamento); // Guarda un departamento CREATE

	public Departamento departamentoXID(int id); // Leer datos de un departamento READ

	public Departamento actualizarDepartamento(Departamento departamento); // Actualiza datos del departamento UPDATE

	public void eliminarDepartamento(int id);// Elimina el departamento DELETE
}
