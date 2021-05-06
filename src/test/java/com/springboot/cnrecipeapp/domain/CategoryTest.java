package com.springboot.cnrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    private Category category;
    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() throws Exception {
        Long id = 100L;
        category.setId(id);

        assertEquals(id, category.getId());
    }
}