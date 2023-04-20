package com.rgibert.ta25_e4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta25_e4.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer> {

}
