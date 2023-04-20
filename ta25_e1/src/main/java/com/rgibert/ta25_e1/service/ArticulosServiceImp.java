package com.rgibert.ta25_e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta25_e1.dao.IArticulosDAO;
import com.rgibert.ta25_e1.dto.Articulo;

@Service
public class ArticulosServiceImp implements IArticulosService {

	// Utilizamos los metodos de la interface IArticulosDAO
	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulo> listarArticulos() {
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(int id) {
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		iArticulosDAO.deleteById(id);
	}

}
