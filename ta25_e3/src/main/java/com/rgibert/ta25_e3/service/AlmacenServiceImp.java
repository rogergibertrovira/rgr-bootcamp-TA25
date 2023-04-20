package com.rgibert.ta25_e3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta25_e3.dao.IAlmacenDAO;
import com.rgibert.ta25_e3.dto.Almacen;

@Service
public class AlmacenServiceImp implements IAlmacenService {

	// Utilizamos los metodos de la interface IAlmacenDAO, es como si instaciaramos.
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(int id) {
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		iAlmacenDAO.deleteById(id);
	}
}
