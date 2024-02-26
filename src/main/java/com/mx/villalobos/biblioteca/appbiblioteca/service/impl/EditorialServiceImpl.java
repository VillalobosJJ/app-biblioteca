package com.mx.villalobos.biblioteca.appbiblioteca.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.EditorialDTO;
import com.mx.villalobos.biblioteca.appbiblioteca.dto.request.EditorialDTORequest;
import com.mx.villalobos.biblioteca.appbiblioteca.model.Editorial;
import com.mx.villalobos.biblioteca.appbiblioteca.repository.EditorialRepository;
import com.mx.villalobos.biblioteca.appbiblioteca.service.EditorialService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EditorialServiceImpl implements EditorialService {

	EditorialRepository editorialRepository;
	
	public EditorialServiceImpl(EditorialRepository editorialRepository) {
		this.editorialRepository = editorialRepository;
	}

	@Override
	public Long save(EditorialDTORequest editorialDTO) {
		Editorial editorial = new Editorial();
		editorial.setName(editorialDTO.getName());
		editorial.setState(BibliotecaConstant.STATE_ACTIVE);
		return this.editorialRepository.save(editorial).getId();
	}

	@Override
	public Long update(EditorialDTORequest dto, Long id) {
		Editorial editorial = this.editorialRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("No se encontró la editorial"));
		editorial.setName(dto.getName());
		return this.editorialRepository.save(editorial).getId();
	}

	@Override
	public EditorialDTO findById(Long id) {
		Editorial editorial = this.editorialRepository.findById(id).get();
		EditorialDTO dto = new EditorialDTO();
		dto.setId(editorial.getId());
		dto.setName(editorial.getName());
		return dto;
		
	}

	@Override
	public List<EditorialDTO> findAll() {
		List<Editorial> list = this.editorialRepository.findAll();
		List<EditorialDTO> listDto = new ArrayList<>();
		list.forEach((bean)->{
			EditorialDTO dto = new EditorialDTO();
			dto.setId(bean.getId());
			dto.setName(bean.getName());
			listDto.add(dto);
		});
		return listDto;
		
	}

}
