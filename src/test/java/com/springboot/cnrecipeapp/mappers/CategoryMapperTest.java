package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Category;
import com.springboot.cnrecipeapp.model.CategoryDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class CategoryMapperTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    CategoryMapper categoryMapper;

    @BeforeEach
    public void setUp() throws Exception{
        categoryMapper = Mappers.getMapper(CategoryMapper.class);{
        }
    }
    @Test
    public void testConvertToDtoNullObject() {
        assertNull(categoryMapper.convertCategoryToDto(null));
    }

    @Test
    public void testConvertToCategoryNullObject() {
        assertNull(categoryMapper.convertToCategory(null));
    }

    @Test
    void testConvertCategoryToDto() {
        //given
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        //when
        CategoryDto categoryDto = categoryMapper.convertCategoryToDto(category);

        //then
        assertEquals(ID_VALUE, categoryDto.getId());
        assertEquals(DESCRIPTION, categoryDto.getDescription());
    }

    @Test
    void testConvertToCategory() {
        //given
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(ID_VALUE);
        categoryDto.setDescription(DESCRIPTION);

        //when
        Category category = categoryMapper.convertToCategory(categoryDto);

        //then
        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());

    }
}