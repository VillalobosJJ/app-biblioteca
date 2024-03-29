package com.mx.villalobos.biblioteca.appbiblioteca.constants;

public final class BibliotecaConstant {
	
	//API VERSION
	public static final String API_VERSION ="/v1";
	
	/*
	  [*****PATH DEL SISTEMA BIBLIOTECA*****]
	 										*/
	public static final String RESOURCE_GENERIC = API_VERSION + "/app-biblioteca";
	
	//EDITORIAL
	public static final String RESOUCE_EDITORIALS = "/editorials";
	public static final String RESOURCE_EDITORIALS_EDITORIAL = "/editorial";
	
	//AUTHOR
	public static final String RESOURCE_AUTHORS = "/authors";
	public static final String RESOURCE_AUTHORS_AUTHOR = "/author";
	
	//LIBRARY
	public static final String RESOUCE_LIBRARIES = "/libraries";
	public static final String RESOURCE_LIBRARIES_LIBRARY = "/library";
	
	//ID
	public static final String RESOURCE_GENERIC_ID = "/{id}";
	
	//PARA LOS PERMISOS DE CONEXION AL MICROSERVICIO
	public static final String CLIENT_FRONTEND = "*";
	
	//STATE
	public static final String STATE_ACTIVE = "1";
	public static final String STATE_INACTIVE = "0";
	
	//NOMBRES DE LAS TABLAS
	public static final String TB_NAME_AUTHOR = "t_author";
	public static final String TB_NAME_EDITORIAL = "t_editorial";
	public static final String TB_NAME_LIBRARY = "t_library";
	
	//ESQUEMAS DB
	public static final String SEC_NAME_DBO = "dbo";
	
	/***************************************
	NOMBRE DE LOS PROCEDIMIENTOS ALMACENADOS
	***************************************/
	
	//FUNCIONES PARA CLASE AUTHOR
	public static final String SP_SEARCH_AUTHOR = "select * from dbo.fn_search_author(?1,?2);";
	public static final String SP_SEARCH_AUTHOR_COUNT = "select count(*) from dbo.fn_search_author(?1,?2);";
	public static final String SP_SAVE_AUTHOR = "select * from dbo.fn_save_author(?1,?2);";
	public static final String SP_SAVE_AUTHOR_COUNT = "select count(*) dbo.fn_save_author(?1,?2);";
	
	//FUNCIONES PARA CLASE LIBRARY
	public static final String SP_SEARCH_LIBRARY = "select * from dbo.fn_search_library(?1,?2);";
	public static final String SP_SEARCH_LIBRARY_COUNT = "select count(*) from dbo.fn_search_library(?1,?2);";
	
}
