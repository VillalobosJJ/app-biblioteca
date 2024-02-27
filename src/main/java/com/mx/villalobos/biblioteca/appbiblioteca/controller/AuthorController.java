package com.mx.villalobos.biblioteca.appbiblioteca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.AuthorDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.service.AuthorService;

@RestController
@RequestMapping(BibliotecaConstant.RESOURCE_GENERIC)
@CrossOrigin(BibliotecaConstant.CLIENT_FRONTEND)
public class AuthorController {
	
	final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	@GetMapping(BibliotecaConstant.RESOURCE_AUTHORS + BibliotecaConstant.RESOURCE_AUTHORS_AUTHOR)
	public List<AuthorDTO> findByKeyWordSQLfindAll(@RequestParam String key_word){
		return this.authorService.findByKeyWordSQL(key_word);
	}
	
	

}
