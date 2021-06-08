package com.springboot.cnrecipeapp.exceptions;

public class RecipeNotFoundException extends RuntimeException{

    public RecipeNotFoundException(String message) {
        super(message);
    }
}
