package br.com.pablo.vinicius.simple.map.struct.intermediateconversions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IntermediatePersonMapper {

    IntermediatePersonMapper INSTANCE = Mappers.getMapper(IntermediatePersonMapper.class);

    @Mapping(source = "birthDate",target = "dateOfBirth")
    IntermediatePersonDto toDto(IntermediatePersonEntity intermediatePersonEntity);
}
