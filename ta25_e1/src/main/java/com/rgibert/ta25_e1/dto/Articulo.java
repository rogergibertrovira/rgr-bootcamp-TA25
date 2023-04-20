package com.rgibert.ta25_e1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo {

	// Atributos de entidad articulo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;

	public Articulo() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Articulo(int id, String nombre, int precio, Fabricante fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
}
