package com.RMgX.sneha.repository;

import java.util.List;
import java.util.Locale.Category;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.sneha.Entity.AssetsEntity;
import com.RMgX.sneha.Entity.CategoryEntity;

@Repository
public interface AssetsRepository extends CrudRepository <AssetsEntity, Long>{

	void deleteById(CategoryEntity categoryEntity);

	void deleteById(AssetsEntity assetsEntity);

	Category saveAll(AssetsEntity assets);

	List<Category> findAllById();

	
}


