package com.rgibert.ta25_e4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rgibert.ta25_e4.dao.ISalaDAO;
import com.rgibert.ta25_e4.dto.Sala;

public class SalaServiceImp implements ISalaService {

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int id) {
		iSalaDAO.deleteById(id);
	}
}
