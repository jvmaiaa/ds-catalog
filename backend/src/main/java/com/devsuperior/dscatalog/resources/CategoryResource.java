package com.devsuperior.dscatalog.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dscatalog.servicer.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;
@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryResource implements Serializable {

	private static final long serialVersionUID = 1L;
	private final CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> listAll(){
		return ResponseEntity.ok(categoryService.findAll());
	}

}
