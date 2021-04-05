package com.springboot.cnrecipeapp.exceptions;

public class UomNotFoundException extends RuntimeException {

    public UomNotFoundException(String message) {
        super(message);
    }
}
