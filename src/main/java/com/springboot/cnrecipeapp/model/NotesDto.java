package com.springboot.cnrecipeapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotesDto {
    private Long id;
    private String recipeNotes;
}
