package com.mx.villalobos.biblioteca.appbiblioteca.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AuthorDTO implements Serializable {
	
	private Long id;
	private String authorName;

}
