package com.springboot.cnrecipeapp.services;

import com.springboot.cnrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
