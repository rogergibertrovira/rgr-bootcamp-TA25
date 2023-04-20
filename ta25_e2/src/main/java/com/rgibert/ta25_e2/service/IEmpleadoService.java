package com.rgibert.ta25_e2.service;

import java.util.List;

import com.rgibert.ta25_e2.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoXID(String dni); // Leer datos de un empleado READ

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(String dni);// Elimina el empleado DELETE
}
