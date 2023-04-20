package com.rgibert.ta25_e4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.ta25_e4.dto.Pelicula;
import com.rgibert.ta25_e4.service.PeliculaServiceImp;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImp peliculaServiceImp;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaServiceImp.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {

		return peliculaServiceImp.guardarPelicula(pelicula);
	}

	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") int id) {
		return peliculaServiceImp.peliculaXID(id);
	}

	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") int id, @RequestBody Pelicula pelicula) {

		Pelicula peliculaSeleccionada = new Pelicula();
		Pelicula peliculaActualizada = new Pelicula();

		peliculaSeleccionada = peliculaServiceImp.peliculaXID(id);

		peliculaSeleccionada.setNombre(pelicula.getNombre());

		peliculaActualizada = peliculaServiceImp.actualizarPelicula(peliculaSeleccionada);

		return peliculaActualizada;
	}

	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") int id) {
		peliculaServiceImp.eliminarPelicula(id);
	}
}
