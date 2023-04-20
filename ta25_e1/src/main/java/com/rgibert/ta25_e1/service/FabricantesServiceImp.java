package com.rgibert.ta25_e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta25_e1.dao.IFabricantesDAO;
import com.rgibert.ta25_e1.dto.Fabricante;

@Service
public class FabricantesServiceImp implements IFabricantesService {

	// Utilizamos los metodos de la interface IFabricanteDAO
	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(int id) {
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int id) {
		iFabricantesDAO.deleteById(id);
	}
}
