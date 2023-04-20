package com.rgibert.ta25_e1.dto;

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
@Table(name = "fabricantes")
public class Fabricante {

	// Atributos de entidad fabricante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "fabricantes_fk")
	private List<Articulo> articulo;

	public Fabricante() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Fabricante(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulos() {
		return articulo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArticulos(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", articulos=" + articulo + "]";
	}
}
