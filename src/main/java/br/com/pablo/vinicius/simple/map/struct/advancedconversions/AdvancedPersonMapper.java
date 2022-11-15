package br.com.pablo.vinicius.simple.map.struct.advancedconversions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Mapper
public interface AdvancedPersonMapper {

    AdvancedPersonMapper INSTANCE = Mappers.getMapper(AdvancedPersonMapper.class);

    @Mapping(source = "birthDate", target = "advancedExtraInfos.dateOfBirth", qualifiedByName = "mapDateToString")
    AdvancedPersonDto toDto(AdvancedPersonEntity advancedPersonEntity);

    @Named("mapDateToString")
    default String mapDateToString(Date date){
        if (Objects.isNull(date)) {
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(date);
    }
}
