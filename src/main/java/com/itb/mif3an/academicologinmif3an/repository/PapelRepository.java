package com.itb.mif3an.academicologinmif3an.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.mif3an.academicologinmif3an.model.Papel;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long>{
	
	Papel findByName(String name);	
	
	

}
