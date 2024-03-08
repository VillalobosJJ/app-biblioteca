package com.mx.villalobos.biblioteca.appbiblioteca.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LibraryDTO implements Serializable {
	
	private Long id;
	private String name;
	private String description;
	private String address;


}
