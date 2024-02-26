package com.mx.villalobos.biblioteca.appbiblioteca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.EditorialDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.request.EditorialDTORequest;
import com.mx.villalobos.biblioteca.appbiblioteca.model.Editorial;
import com.mx.villalobos.biblioteca.appbiblioteca.service.EditorialService;

@RestController
@RequestMapping(BibliotecaConstant.RESOURCE_GENERIC)
@CrossOrigin(BibliotecaConstant.CLIENT_FRONTEND)
public class EditorialController {
	
	private EditorialService editorialService;

	public EditorialController(EditorialService editorialService) {
		this.editorialService = editorialService;
	}
	
	@GetMapping(BibliotecaConstant.RESOUCE_EDITORIALS + BibliotecaConstant.RESOURCE_EDITORIALS_EDITORIAL)
	public List<EditorialDTO> findAll(){
		return this.editorialService.findAll();
	}
	
	@GetMapping(BibliotecaConstant.RESOUCE_EDITORIALS + BibliotecaConstant.RESOURCE_EDITORIALS_EDITORIAL + BibliotecaConstant.RESOURCE_GENERIC_ID)
	public EditorialDTO findById(@PathVariable Long id) {
		return this.editorialService.findById(id);
	}
	@PostMapping(BibliotecaConstant.RESOUCE_EDITORIALS + BibliotecaConstant.RESOURCE_EDITORIALS_EDITORIAL)
	public Long save(@RequestBody EditorialDTORequest dto) {
		return this.editorialService.save(dto);
	}
	
	@PostMapping(BibliotecaConstant.RESOUCE_EDITORIALS + BibliotecaConstant.RESOURCE_EDITORIALS_EDITORIAL + BibliotecaConstant.RESOURCE_GENERIC_ID)
	public Long update(@RequestBody EditorialDTORequest dto, @PathVariable Long id) {
		return this.editorialService.update(dto, id);
	}
	

}
