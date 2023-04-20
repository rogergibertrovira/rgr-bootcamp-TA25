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

import com.rgibert.ta25_e2.dto.Empleado;
import com.rgibert.ta25_e2.service.EmpleadoServiceImp;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImp empleadoServiceImp;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImp.listarEmpleados();
	}

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {

		return empleadoServiceImp.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXID(@PathVariable(name = "dni") String dni) {
		return empleadoServiceImp.empleadoXID(dni);
	}

	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado = empleadoServiceImp.empleadoXID(dni);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());

		empleado_actualizado = empleadoServiceImp.actualizarEmpleado(empleado_seleccionado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name = "dni") String dni) {
		empleadoServiceImp.eliminarEmpleado(dni);
	}

}
