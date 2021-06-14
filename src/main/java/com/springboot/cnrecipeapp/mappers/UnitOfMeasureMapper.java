package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.UnitOfMeasure;
import com.springboot.cnrecipeapp.model.UnitOfMeasureDto;
import org.mapstruct.Mapper;

@Mapper
public interface UnitOfMeasureMapper {

    UnitOfMeasureDto convertToUomDto(UnitOfMeasure uom);

    UnitOfMeasure convertToUom(UnitOfMeasureDto uomDto);
}
