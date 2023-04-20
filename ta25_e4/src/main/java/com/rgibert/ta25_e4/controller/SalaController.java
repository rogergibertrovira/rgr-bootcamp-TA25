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

import com.rgibert.ta25_e4.dto.Sala;
import com.rgibert.ta25_e4.service.SalaServiceImp;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImp salaServiceImp;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaServiceImp.listarSalas();
	}

	@PostMapping("/salas")
	public Sala salvarSala(@RequestBody Sala sala) {

		return salaServiceImp.guardarSala(sala);
	}

	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name = "id") int id) {
		return salaServiceImp.salaXID(id);
	}

	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") int id, @RequestBody Sala sala) {

		Sala salaSeleccionada = new Sala();
		Sala salaActualizada = new Sala();

		salaSeleccionada = salaServiceImp.salaXID(id);

		salaSeleccionada.setNombre(sala.getNombre());

		salaActualizada = salaServiceImp.actualizarSala(salaSeleccionada);

		return salaActualizada;
	}

	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name = "id") int id) {
		salaServiceImp.eliminarSala(id);
	}
	
}
