package com.rgibert.ta25_e3.service;

import java.util.List;

import com.rgibert.ta25_e3.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCajas(); // Listar All

	public Caja guardarCaja(Caja departamento); // Guarda un caja CREATE

	public Caja cajaXID(String numRef); // Leer datos de un caja READ

	public Caja actualizarCaja(Caja caja); // Actualiza datos del caja UPDATE

	public void eliminarCaja(String numRef);// Elimina el caja DELETE
}
