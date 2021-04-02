package com.springboot.cnrecipeapp.controllers;

import com.springboot.cnrecipeapp.domain.Category;
import com.springboot.cnrecipeapp.domain.UnitOfMeasure;
import com.springboot.cnrecipeapp.repositories.CategoryRepository;
import com.springboot.cnrecipeapp.repositories.UnitOfMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        //System.out.println("Something");
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        log.info("Cat Id is: " + categoryOptional.get().getId());
        log.info("UOM ID is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
