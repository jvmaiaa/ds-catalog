package com.devsuperior.dscatalog.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping("/category")
public class CategoryResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GetMapping
	public ResponseEntity<List<Category>> listAll(){
		List<Category> lista = new ArrayList<>();
		lista.add(new Category(1L, "Alimento"));
		return ResponseEntity.ok(lista);
	}

}
