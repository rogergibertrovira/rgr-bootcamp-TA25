package com.rgibert.ta25_e3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.ta25_e3.dao.ICajaDAO;
import com.rgibert.ta25_e3.dto.Caja;

@Service
public class CajaServiceImp implements ICajaService {

	// Utilizamos los metodos de la interface ICajaDAO, es como si instaciaramos.
	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String numRef) {
		return iCajaDAO.findById(numRef).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numRef) {
		iCajaDAO.deleteById(numRef);
	}
}
