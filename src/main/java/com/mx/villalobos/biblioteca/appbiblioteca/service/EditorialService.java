package com.mx.villalobos.biblioteca.appbiblioteca.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mx.villalobos.biblioteca.appbiblioteca.dto.EditorialDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.request.EditorialDTORequest;

public interface EditorialService {
	
	public Long save(EditorialDTORequest editorial);
	
	public Long update(EditorialDTORequest dto, Long id);
	
	public EditorialDTO findById(Long id);
	
	public List<EditorialDTO> findAll();
	
	public Page<EditorialDTO> findByNameLike(String name, Pageable pageable);

}
