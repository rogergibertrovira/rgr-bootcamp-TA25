package com.rgibert.ta25_e2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta25_e2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{

}
