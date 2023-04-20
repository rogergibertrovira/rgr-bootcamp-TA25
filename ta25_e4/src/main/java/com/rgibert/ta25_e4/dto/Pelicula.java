package com.rgibert.ta25_e4.dto;

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
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cal_edad")
	private int calEdad;

	@OneToMany
	@JoinColumn(name = "peliculas_fk")
	private List<Sala> sala;

	public Pelicula() {

	}

	public Pelicula(String nombre, int calEdad) {
		this.nombre = nombre;
		this.calEdad = calEdad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCalEdad() {
		return calEdad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCalEdad(int calEdad) {
		this.calEdad = calEdad;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calEdad=" + calEdad + ", sala=" + sala + "]";
	}
}
