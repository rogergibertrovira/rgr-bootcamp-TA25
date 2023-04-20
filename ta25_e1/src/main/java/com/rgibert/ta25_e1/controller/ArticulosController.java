package com.rgibert.ta25_e1.controller;

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

import com.rgibert.ta25_e1.dto.Articulo;
import com.rgibert.ta25_e1.service.ArticulosServiceImp;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImp articulosServiceImp;

	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articulosServiceImp.listarArticulos();
	}

	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articulosServiceImp.guardarArticulo(articulo);
	}

	@GetMapping("/articulos/{id}")
	public Articulo articuloXID(@PathVariable(name = "id") int id) {
		return articulosServiceImp.articuloXID(id);
	}

	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name = "id") int id, @RequestBody Articulo articulo) {
		Articulo articuloSeleccionado = new Articulo();
		Articulo articuloActualizado = new Articulo();

		articuloSeleccionado = articulosServiceImp.articuloXID(id);

		articuloSeleccionado.setNombre(articulo.getNombre());
		articuloSeleccionado.setFabricante(articulo.getFabricante());

		articuloActualizado = articulosServiceImp.actualizarArticulo(articuloSeleccionado);

		return articuloActualizado;
	}

	@DeleteMapping("articulos/{id}")
	public void eliminarArticulo(@PathVariable(name = "id") int id) {
		articulosServiceImp.eliminarArticulo(id);
	}
}