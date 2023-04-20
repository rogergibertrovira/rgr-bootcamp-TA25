package com.rgibert.ta25_e4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;

	public Sala() {

	}

	public Sala(String nombre, Pelicula pelicula) {
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
}
