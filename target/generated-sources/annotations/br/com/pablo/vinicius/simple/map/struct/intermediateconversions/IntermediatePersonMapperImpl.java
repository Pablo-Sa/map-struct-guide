package br.com.pablo.vinicius.simple.map.struct.intermediateconversions;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T20:06:11-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class IntermediatePersonMapperImpl implements IntermediatePersonMapper {

    @Override
    public IntermediatePersonDto toDto(IntermediatePersonEntity intermediatePersonEntity) {
        if ( intermediatePersonEntity == null ) {
            return null;
        }

        IntermediatePersonDto.IntermediatePersonDtoBuilder intermediatePersonDto = IntermediatePersonDto.builder();

        intermediatePersonDto.dateOfBirth( intermediatePersonEntity.getBirthDate() );
        intermediatePersonDto.name( intermediatePersonEntity.getName() );
        intermediatePersonDto.surName( intermediatePersonEntity.getSurName() );
        intermediatePersonDto.age( intermediatePersonEntity.getAge() );

        return intermediatePersonDto.build();
    }
}
