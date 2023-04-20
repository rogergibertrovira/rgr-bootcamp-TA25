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

import com.rgibert.ta25_e3.dto.Caja;
import com.rgibert.ta25_e3.service.CajaServiceImp;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImp cajaServiceImp;

	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImp.listarCajas();
	}

	@PostMapping("/cajas")
	public Caja salvarCaja(@RequestBody Caja caja) {

		return cajaServiceImp.guardarCaja(caja);
	}

	@GetMapping("/cajas/{numref}")
	public Caja cajaXID(@PathVariable(name = "numref") String numRef) {
		return cajaServiceImp.cajaXID(numRef);
	}

	@PutMapping("/cajas/{numref}")
	public Caja actualizarCaja(@PathVariable(name = "numref") String numRef, @RequestBody Caja caja) {

		Caja caja_seleccionado = new Caja();
		Caja caja_actualizado = new Caja();

		caja_seleccionado = cajaServiceImp.cajaXID(numRef);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());

		caja_actualizado = cajaServiceImp.actualizarCaja(caja_seleccionado);

		return caja_actualizado;
	}

	@DeleteMapping("/cajas/{numref}")
	public void eliminarCaja(@PathVariable(name = "numref") String numRef) {
		cajaServiceImp.eliminarCaja(numRef);
	}
}
