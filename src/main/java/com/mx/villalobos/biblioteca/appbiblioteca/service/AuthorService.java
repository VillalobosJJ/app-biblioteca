package com.mx.villalobos.biblioteca.appbiblioteca.service;

import java.util.List;

import com.mx.villalobos.biblioteca.appbiblioteca.dto.AuthorDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.request.AuthorDTORequest;


public interface AuthorService {
	
	public List<AuthorDTO> findByKeyWordSQL(String key_word);
	public AuthorDTO saveSQL(AuthorDTORequest dto);
}
