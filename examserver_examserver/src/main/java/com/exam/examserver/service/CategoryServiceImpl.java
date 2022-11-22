package com.exam.examserver.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.model.Category;
import com.exam.examserver.repository.CategoryRepository;




@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}

	@Override
	public Category getSingleCategory(int id) {
		return categoryRepository.findById(id).get();
		
	}

	@Override
	public Category saveCategory(Category	 CategoryModel) {
		return categoryRepository.save(CategoryModel);
	
	}

	@Override
	public Category updateCategory(Category CategoryModel) {
		return categoryRepository.save(CategoryModel);
		
	}

	@Override
	public void deleteCategory(int Id) {
		categoryRepository.findById(Id);
		categoryRepository.deleteById(Id);
		
	}

}
