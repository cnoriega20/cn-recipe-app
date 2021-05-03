package com.springboot.cnrecipeapp.controllers;

import com.springboot.cnrecipeapp.domain.Category;
import com.springboot.cnrecipeapp.domain.UnitOfMeasure;
import com.springboot.cnrecipeapp.repositories.CategoryRepository;
import com.springboot.cnrecipeapp.repositories.UnitOfMeasureRepository;
import com.springboot.cnrecipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        //System.out.println("Something");
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        log.info("Cat Id is: " + categoryOptional.get().getId());
        log.info("UOM ID is: " + unitOfMeasureOptional.get().getId());

        log.debug("Getting index page..");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
