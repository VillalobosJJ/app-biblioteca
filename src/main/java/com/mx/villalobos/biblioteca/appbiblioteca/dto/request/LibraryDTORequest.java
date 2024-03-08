package com.mx.villalobos.biblioteca.appbiblioteca.dto.request;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LibraryDTORequest implements Serializable {
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 5, max = 100)
	private String name;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 5, max = 500)
	private String description;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 5, max = 150)
	private String addres;

}
