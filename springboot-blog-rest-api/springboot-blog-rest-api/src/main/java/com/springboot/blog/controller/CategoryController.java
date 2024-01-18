package com.springboot.blog.controller;

import com.springboot.blog.payload.CategoryDto;
import com.springboot.blog.service.CategoryService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @SecurityRequirement(
            name = "Bear Authentication"
    )
    // Build Add Category Rest API
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CategoryDto> addCategory(@RequestBody CategoryDto categoryDto) {
        CategoryDto savedCategory = categoryService.addCategory(categoryDto);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }


    // Build Get Category REST API by id
    @GetMapping("{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable("id") Long categoryId) {
        CategoryDto categoryDto = categoryService.getCategory(categoryId);
        return ResponseEntity.ok(categoryDto);
    }

    // Build Get All Categories REST API
    @GetMapping()
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @SecurityRequirement(
            name = "Bear Authentication"
    )
    // Build Update Category REST API by id
    @PutMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable("id") long categoryId) {
        return new ResponseEntity<>(categoryService.updateCategory(categoryDto, categoryId), HttpStatus.OK);
    }

    @SecurityRequirement(
            name = "Bear Authentication"
    )
    @DeleteMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long categoryId) {
        categoryService.deleteCategoryById(categoryId);
        return new ResponseEntity<>("Category entity deleted successfully!", HttpStatus.OK);
    }
}
