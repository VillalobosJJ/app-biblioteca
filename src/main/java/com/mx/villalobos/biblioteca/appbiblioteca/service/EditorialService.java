package com.mx.villalobos.biblioteca.appbiblioteca.service;

import java.util.List;

import com.mx.villalobos.biblioteca.appbiblioteca.dto.EditorialDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.request.EditorialDTORequest;
import com.mx.villalobos.biblioteca.appbiblioteca.model.Editorial;

public interface EditorialService {
	
	public Long save(EditorialDTORequest editorial);
	
	public Long update(EditorialDTORequest dto, Long id);
	
	public EditorialDTO findById(Long id);
	
	public List<EditorialDTO> findAll();

}
