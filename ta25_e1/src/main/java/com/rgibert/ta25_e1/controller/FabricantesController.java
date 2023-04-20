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

import com.rgibert.ta25_e1.dto.Fabricante;
import com.rgibert.ta25_e1.service.FabricantesServiceImp;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImp fabricantesServiceImp;

	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricantesServiceImp.listarFabricantes();
	}

	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricantesServiceImp.guardarFabricante(fabricante);
	}

	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name = "id") int id) {
		return fabricantesServiceImp.fabricanteXID(id);
	}

	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") int id,
			@RequestBody Fabricante fabricante) {
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteActualizado = new Fabricante();

		fabricanteSeleccionado = fabricantesServiceImp.fabricanteXID(id);

		fabricanteSeleccionado.setNombre(fabricante.getNombre());

		fabricanteActualizado = fabricantesServiceImp.actualizarFabricante(fabricanteSeleccionado);

		return fabricanteActualizado;
	}

	@DeleteMapping("fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name = "id") int id) {
		fabricantesServiceImp.eliminarFabricante(id);
	}
}
