package com.springboot.cnrecipeapp.mappers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class CategoryMapperTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    CategoryMapper categoryMapper;

    @BeforeEach
    public void setUp() throws Exception{
        categoryMapper = Mappers.getMapper(CategoryMapper.class);{
        }
    }
   /* @Test
    public void testConvertToDtoNullObject() {
        assertNull(categoryMapper.convertCategoryToDto(null));
    }

    @Test
    public void testConvertToCategoryNullObject() {
        assertNull(categoryMapper.convertToCategory(null));
    }*/

    @Test
    void convertCategoryToDto() {
    }

    @Test
    void convertToCategory() {
    }
}