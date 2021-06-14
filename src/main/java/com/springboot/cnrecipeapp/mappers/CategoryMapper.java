package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Category;
import com.springboot.cnrecipeapp.model.CategoryDto;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

   CategoryDto convertCategoryToDto(Category category);
   Category convertToCategory(CategoryDto categoryDto);
}
