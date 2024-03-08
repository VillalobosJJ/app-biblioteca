package com.mx.villalobos.biblioteca.appbiblioteca.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.LibraryDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.model.Library;
import com.mx.villalobos.biblioteca.appbiblioteca.repository.LibraryRepository;
import com.mx.villalobos.biblioteca.appbiblioteca.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	//Inyección de dependecias
	@Autowired
	private LibraryRepository libraryRepository;


	@Override
	public List<LibraryDTO> findByNameLikeJPA(String key_word) {
		List<Library> libraries =  this.libraryRepository.findByKeyWordSQL(key_word, BibliotecaConstant.STATE_ACTIVE);
		return libraries.stream()
				.map((bean ->convertBeanToDto(bean)))
				.collect(Collectors.toList());
	}
	
	public LibraryDTO convertBeanToDto(Library library) {
		return LibraryDTO.builder()
				.id(library.getId())
				.name(library.getName())
				.description(library.getDescription())
				.address(library.getAddress()).build();
	}
	
	

}
