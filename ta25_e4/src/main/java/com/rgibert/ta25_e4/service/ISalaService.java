package com.rgibert.ta25_e4.service;

import java.util.List;

import com.rgibert.ta25_e4.dto.Sala;

public interface ISalaService {
	
	public List<Sala> listarSalas(); // Listar All
	
	public Sala guardarSala(Sala sala); // Guarda un sala CREATE

	public Sala salaXID(int id); // Leer datos de un sala READ

	public Sala actualizarSala(Sala sala); // Actualiza datos del sala UPDATE

	public void eliminarSala(int id);// Elimina el sala DELETE
}
