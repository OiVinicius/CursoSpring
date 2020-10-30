package com.senaisp.curso_spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senaisp.curso_spring.domain.Categoria;
import com.senaisp.curso_spring.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResources {
	
	@Autowired
	CategoriaService obj;
	@RequestMapping(method=RequestMethod.GET,value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {
	
		Categoria categoria = obj.buscar(id);
		return ResponseEntity.ok().body(categoria);
	}
}