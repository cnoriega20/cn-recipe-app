package com.springboot.cnrecipeapp.controllers;

import com.springboot.cnrecipeapp.domain.Recipe;
import com.springboot.cnrecipeapp.repositories.CategoryRepository;
import com.springboot.cnrecipeapp.repositories.UnitOfMeasureRepository;
import com.springboot.cnrecipeapp.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    private IndexController indexController;
    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Mock
    private RecipeService recipeService;

    @Mock
    private Model model;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        indexController = new IndexController(
                categoryRepository,
                unitOfMeasureRepository,
                recipeService);
    }

    @Test
    public void testGetIndexPage() throws Exception{

        /*********** B D D *********************/

        // Given
        Set<Recipe> recipesSet = new HashSet<>();
        recipesSet.add(new Recipe());
        Recipe recipe = new Recipe();
        recipesSet.add(recipe);

        //When
        when(recipeService.getRecipes()).thenReturn(recipesSet);
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);


        String viewModel = indexController.getIndexPage(model);
        assertEquals("index", viewModel);

        //Then
        //Verify mock interactions
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"),argumentCaptor.capture());

        Set<Recipe> setArgumentCaptor = argumentCaptor.getValue();
        assertEquals(2, setArgumentCaptor.size());
    }

}