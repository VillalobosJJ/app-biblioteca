package com.mx.villalobos.biblioteca.appbiblioteca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.LibraryDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.service.LibraryService;

@RestController
@RequestMapping(BibliotecaConstant.RESOURCE_GENERIC)
@CrossOrigin(BibliotecaConstant.CLIENT_FRONTEND)
public class LibraryController {
	
	final LibraryService libraryService;

	
	public LibraryController(LibraryService libraryService) {
		this.libraryService = libraryService;
	}
	
	@GetMapping(BibliotecaConstant.RESOUCE_LIBRARIES + BibliotecaConstant.RESOURCE_LIBRARIES_LIBRARY)
	public List<LibraryDTO> findByNameLikeJPA(@RequestParam String key_word){
		return this.libraryService.findByNameLikeJPA(key_word);
	}	

}
