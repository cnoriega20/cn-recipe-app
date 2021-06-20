package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Ingredient;
import com.springboot.cnrecipeapp.domain.Recipe;
import com.springboot.cnrecipeapp.domain.UnitOfMeasure;
import com.springboot.cnrecipeapp.model.IngredientDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IngredientMapperTest {

    private static final Recipe RECIPE = new Recipe();
    private static final BigDecimal AMOUNT = new BigDecimal("1");
    private static final String DESCRIPTION = "Cheeseburger";
    private static final Long ID_VALUE = 1L;
    private static final Long UOM_ID = 2L;

    private IngredientMapper ingredientMapper;

    @BeforeEach
    public void setUp() throws Exception{
        ingredientMapper = Mappers.getMapper(IngredientMapper.class);
    }

    @Test
    public void testConvertToIngredientDto() {
        //given
        Ingredient ingredient= new Ingredient();
        ingredient.setId(ID_VALUE);
        ingredient.setAmount(AMOUNT);
        ingredient.setDescription(DESCRIPTION);
        UnitOfMeasure uom = new UnitOfMeasure();
        ingredient.setUom(uom);

        //when
        IngredientDto ingredientDto = ingredientMapper.convertToIngredientDto(ingredient);

        //then
        assertNotNull(ingredientDto);
        //assertNotNull(ingredientDto.getUnitOfMeasure());
        assertEquals(ID_VALUE, ingredientDto.getId());
        assertEquals(AMOUNT, ingredientDto.getAmount());
        assertEquals(DESCRIPTION, ingredientDto.getDescription());
       // assertEquals(UOM_ID, ingredientDto.getUnitOfMeasure().getId());


    }

    @Test
    void testConvertToIngredient() {
    }
}