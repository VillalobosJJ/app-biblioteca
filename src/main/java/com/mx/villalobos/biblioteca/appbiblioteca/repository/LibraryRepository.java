package com.mx.villalobos.biblioteca.appbiblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mx.villalobos.biblioteca.appbiblioteca.constants.BibliotecaConstant;
import com.mx.villalobos.biblioteca.appbiblioteca.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{
	
	//@Query("select li from Library li where LOWER(li.name) like CONCAT('%',LOWER(?1),'%') and li.state = ?2")
	@Query(value = BibliotecaConstant.SP_SEARCH_LIBRARY,nativeQuery = true,countQuery = BibliotecaConstant.SP_SEARCH_LIBRARY_COUNT)
	public List<Library> findByKeyWordSQL(String key_word,String state);

}
