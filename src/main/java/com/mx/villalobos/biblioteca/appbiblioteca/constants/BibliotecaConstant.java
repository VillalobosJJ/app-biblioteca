package com.mx.villalobos.biblioteca.appbiblioteca.constants;

public final class BibliotecaConstant {
	
	//API VERSION
	public static final String API_VERSION ="/v1";
	
	//PATH DEL SISTEMA BIBLIOTECA
	public static final String RESOURCE_GENERIC = API_VERSION + "/app-biblioteca";
	public static final String RESOUCE_EDITORIALS = "/editorials";
	public static final String RESOURCE_EDITORIALS_EDITORIAL = "/editorial";
	public static final String RESOURCE_GENERIC_ID = "/{id}";
	
	//PARA LOS PERMISOS DE CONEXION AL MICROSERVICIO
	public static final String CLIENT_FRONTEND = "*";
	
	//STATE
	public static final String STATE_ACTIVE = "1";
	public static final String STATE_INACTIVE = "0";

	
}
