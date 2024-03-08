package com.mx.villalobos.biblioteca.appbiblioteca.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
public class EditorialDTO implements Serializable{
	
	public EditorialDTO() {
		// TODO Auto-generated constructor stub
	}
	private Long id;
	private String name;
	

}
