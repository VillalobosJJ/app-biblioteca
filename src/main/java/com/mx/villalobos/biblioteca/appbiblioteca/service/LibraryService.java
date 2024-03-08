package com.mx.villalobos.biblioteca.appbiblioteca.service;

import java.util.List;

import com.mx.villalobos.biblioteca.appbiblioteca.dto.LibraryDTO;

public interface LibraryService {
	
	public List<LibraryDTO> findByNameLikeJPA(String key_word);

}
