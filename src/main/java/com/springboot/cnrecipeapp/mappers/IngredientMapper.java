package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Ingredient;
import com.springboot.cnrecipeapp.model.IngredientDto;
import org.mapstruct.Mapper;

@Mapper(uses = UnitOfMeasureMapper.class)
public interface IngredientMapper {

    IngredientDto convertToIngredientDto(Ingredient ingredient);

    Ingredient convertToIngredient(IngredientDto ingredientDto);


}
