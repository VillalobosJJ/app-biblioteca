package com.mx.villalobos.biblioteca.appbiblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.villalobos.biblioteca.appbiblioteca.dto.AuthorDTO;


public interface AuthorService {
	
	public List<AuthorDTO> findByKeyWordSQL(String key_word);
}
