package com.rgibert.ta25_e1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.ta25_e1.dto.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Integer>{
	
}
