package com.mx.villalobos.biblioteca.appbiblioteca.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.villalobos.biblioteca.appbiblioteca.model.Editorial;


@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long>{
	
	public Page<Editorial> findByNameAndState (String name, String state, Pageable pageable);

}
