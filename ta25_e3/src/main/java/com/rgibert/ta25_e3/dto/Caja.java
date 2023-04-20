package com.rgibert.ta25_e3.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {
	@Id
	@Column(name = "num_referencia")
	private String numRef;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen_id")
	private Almacen almacen;

	public Caja() {

	}

	public Caja(String numRef, String contenido, int valor, Almacen almacen) {
		this.numRef = numRef;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public String getNumRef() {
		return numRef;
	}

	public String getContenido() {
		return contenido;
	}

	public int getValor() {
		return valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setNumRef(String numRef) {
		this.numRef = numRef;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numRef=" + numRef + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen
				+ "]";
	}

}
