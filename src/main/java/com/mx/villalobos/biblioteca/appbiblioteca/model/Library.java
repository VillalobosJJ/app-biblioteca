package com.mx.villalobos.biblioteca.appbiblioteca.model;

import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = BibliotecaConstant.TB_NAME_LIBRARY, schema = BibliotecaConstant.SEC_NAME_DBO)
public class Library {
	
	@Id
	@Column(name = "idlibrary")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "state")
	private String state;

}
