package com.springboot.cnrecipeapp.repositories;

import com.springboot.cnrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
