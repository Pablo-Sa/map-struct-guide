package br.com.pablo.vinicius.simple.map.struct.simpleparse;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SimplePersonMapper {

    SimplePersonMapper INSTANCE = Mappers.getMapper(SimplePersonMapper.class);

    SimplePersonDto toDto(SimplePersonEntity simplePersonEntity);

    List<SimplePersonDto> toDtoList(List<SimplePersonEntity> simplePersonEntity);


    SimplePersonEntity toEntity(SimplePersonDto simplePersonDto);
}
