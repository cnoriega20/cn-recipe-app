package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.Notes;
import com.springboot.cnrecipeapp.model.NotesDto;
import org.mapstruct.Mapper;

@Mapper
public interface NotesMapper {

    NotesDto convertToNotesDto(Notes notes);

    Notes convertToNotes(NotesDto notesDto);

}
