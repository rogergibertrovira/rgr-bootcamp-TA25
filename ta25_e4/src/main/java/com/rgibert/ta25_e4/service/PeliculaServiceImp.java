package com.rgibert.ta25_e4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rgibert.ta25_e4.dao.IPeliculaDAO;
import com.rgibert.ta25_e4.dto.Pelicula;

public class PeliculaServiceImp implements IPeliculaService {

	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int id) {
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int id) {
		iPeliculaDAO.deleteById(id);
	}

}
