package com.rgibert.ta25_e3.controller;

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

import com.rgibert.ta25_e3.dto.Almacen;
import com.rgibert.ta25_e3.service.AlmacenServiceImp;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImp almacenServiceImp;

	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		return almacenServiceImp.listarAlmacenes();
	}

	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {

		return almacenServiceImp.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenXID(@PathVariable(name = "id") int id) {
		return almacenServiceImp.almacenXID(id);
	}

	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id") int id, @RequestBody Almacen almacen) {

		Almacen almacen_seleccionado = new Almacen();
		Almacen almacen_actualizado = new Almacen();

		almacen_seleccionado = almacenServiceImp.almacenXID(id);

		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());

		almacen_actualizado = almacenServiceImp.actualizarAlmacen(almacen_seleccionado);

		return almacen_actualizado;
	}

	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") int id) {
		almacenServiceImp.eliminarAlmacen(id);
	}
}
