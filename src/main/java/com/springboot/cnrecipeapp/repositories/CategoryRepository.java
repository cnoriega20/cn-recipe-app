package com.springboot.cnrecipeapp.repositories;

import com.springboot.cnrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
