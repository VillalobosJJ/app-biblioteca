package com.mx.villalobos.biblioteca.appbiblioteca.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class EditorialDTORequest {
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 5, max = 100)
	private String name;

}
