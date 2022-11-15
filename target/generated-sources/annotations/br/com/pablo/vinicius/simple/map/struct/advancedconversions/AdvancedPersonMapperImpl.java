package br.com.pablo.vinicius.simple.map.struct.advancedconversions;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T20:06:11-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class AdvancedPersonMapperImpl implements AdvancedPersonMapper {

    @Override
    public AdvancedPersonDto toDto(AdvancedPersonEntity advancedPersonEntity) {
        if ( advancedPersonEntity == null ) {
            return null;
        }

        AdvancedPersonDto.AdvancedPersonDtoBuilder advancedPersonDto = AdvancedPersonDto.builder();

        advancedPersonDto.advancedExtraInfos( advancedPersonEntityToAdvancedExtraInfos( advancedPersonEntity ) );
        advancedPersonDto.name( advancedPersonEntity.getName() );
        advancedPersonDto.surName( advancedPersonEntity.getSurName() );
        advancedPersonDto.age( advancedPersonEntity.getAge() );

        return advancedPersonDto.build();
    }

    protected AdvancedExtraInfos advancedPersonEntityToAdvancedExtraInfos(AdvancedPersonEntity advancedPersonEntity) {
        if ( advancedPersonEntity == null ) {
            return null;
        }

        AdvancedExtraInfos.AdvancedExtraInfosBuilder advancedExtraInfos = AdvancedExtraInfos.builder();

        advancedExtraInfos.dateOfBirth( mapDateToString( advancedPersonEntity.getBirthDate() ) );

        return advancedExtraInfos.build();
    }
}
