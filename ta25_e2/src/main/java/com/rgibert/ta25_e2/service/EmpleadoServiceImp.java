package com.rgibert.ta25_e2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta25_e2.dao.IEmpleadoDAO;
import com.rgibert.ta25_e2.dto.Empleado;

@Service
public class EmpleadoServiceImp implements IEmpleadoService {

	// Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		iEmpleadoDAO.deleteById(dni);
	}
}
