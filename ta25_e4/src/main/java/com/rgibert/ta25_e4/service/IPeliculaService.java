package com.rgibert.ta25_e4.service;

import java.util.List;

import com.rgibert.ta25_e4.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas(); // Listar All
	
	public Pelicula guardarPelicula(Pelicula pelicula); // Guarda un pelicula CREATE

	public Pelicula peliculaXID(int id); // Leer datos de un pelicula READ

	public Pelicula actualizarPelicula(Pelicula pelicula); // Actualiza datos del pelicula UPDATE

	public void eliminarPelicula(int id);// Elimina el pelicula DELETE
}
