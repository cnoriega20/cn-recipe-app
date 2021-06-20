package com.springboot.cnrecipeapp.mappers;

import com.springboot.cnrecipeapp.domain.UnitOfMeasure;
import com.springboot.cnrecipeapp.model.UnitOfMeasureDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class UnitOfMeasureMapperTest {

    private static final String DESCRIPTION = "description";
    public static final Long LONG_VALUE = 1l;

    private UnitOfMeasureMapper uomMapper;
    @BeforeEach
    void setUp() throws Exception{
        uomMapper = Mappers.getMapper(UnitOfMeasureMapper.class);
    }

    @Test
    public void testNullConvertToUomDto() throws Exception {
        assertNull(uomMapper.convertToUomDto(null));
    }

    @Test
    public void testEmptyObjectConvertToUomDto() throws Exception {
        assertNotNull(uomMapper.convertToUomDto(new UnitOfMeasure()));
    }


    @Test
    void testConvertToUomDto() throws Exception{
        //given
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(LONG_VALUE);
        uom.setDescription(DESCRIPTION);

        //when
        UnitOfMeasureDto uomDto = uomMapper.convertToUomDto(uom);

        //then
        assertNotNull(uomDto);
        assertEquals(LONG_VALUE, uomDto.getId());
        assertEquals(DESCRIPTION, uomDto.getDescription());
    }

    @Test
    public void testNullConvertToUom() throws Exception {
        assertNull(uomMapper.convertToUom(null));
    }

    @Test
    public void testEmptyObjectConvertToUom() throws Exception {
        assertNotNull(uomMapper.convertToUom(new UnitOfMeasureDto()));
    }
    @Test
    void testConvertToUom() throws Exception{
        //given
        UnitOfMeasureDto uomDto = new UnitOfMeasureDto();
        uomDto.setId(LONG_VALUE);
        uomDto.setDescription(DESCRIPTION);

        //when
        UnitOfMeasure uom = uomMapper.convertToUom(uomDto);

        //then
        assertNotNull(uom);
        assertEquals(LONG_VALUE, uom.getId());
        assertEquals(DESCRIPTION, uom.getDescription());

    }
}