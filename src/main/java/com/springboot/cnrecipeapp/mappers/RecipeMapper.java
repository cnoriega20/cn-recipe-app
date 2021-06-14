package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Recipe;
import com.springboot.cnrecipeapp.model.RecipeDto;
import org.mapstruct.Mapper;

@Mapper(uses = { CategoryMapper.class, IngredientMapper.class, NotesMapper.class })
public interface RecipeMapper {

    RecipeDto convertToRecipeDto(Recipe recipe);

    Recipe convertToRecipe(RecipeDto recipeDto);
}
