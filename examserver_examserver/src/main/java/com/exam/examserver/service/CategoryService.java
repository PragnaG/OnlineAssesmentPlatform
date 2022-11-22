package com.exam.examserver.service;

import java.util.List;

import com.exam.examserver.model.Category;


public interface CategoryService {
	List<Category> getAllCategory();
	 
	Category getSingleCategory(int Id);
	 
	Category saveCategory(Category CategoryModel);
	 
	Category updateCategory(Category CategoryModel);

	void deleteCategory(int id);	

}
