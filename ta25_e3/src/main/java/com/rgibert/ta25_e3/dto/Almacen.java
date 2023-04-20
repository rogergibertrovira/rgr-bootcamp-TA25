package com.rgibert.ta25_e3.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes")
public class Almacen {

	// Atributos de entidad almacen
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name = "almacenes_fk")
	private List<Caja> caja;

	public int getId() {
		return id;
	}

	public String getLugar() {
		return lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}
}
