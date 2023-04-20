package com.rgibert.ta25_e2.controller;

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

import com.rgibert.ta25_e2.dto.Departamento;
import com.rgibert.ta25_e2.service.DepartamentoServiceImp;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImp departamentoServiceImp;

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos() {
		return departamentoServiceImp.listarDepartamentos();
	}

	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {

		return departamentoServiceImp.guardarDepartamento(departamento);
	}

	@GetMapping("/departamentos/{id}")
	public Departamento departamentoXID(@PathVariable(name = "id") int id) {
		return departamentoServiceImp.departamentoXID(id);
	}

	@PutMapping("/departamentos/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name = "id") int id, @RequestBody Departamento departamento) {

		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();

		departamento_seleccionado = departamentoServiceImp.departamentoXID(id);

		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServiceImp.actualizarDepartamento(departamento_seleccionado);

		return departamento_actualizado;
	}

	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name = "id") int id) {
		departamentoServiceImp.eliminarDepartamento(id);
	}
}
