package br.com.pablo.vinicius.simple.map.struct.simpleparse;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T20:06:11-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class SimplePersonMapperImpl implements SimplePersonMapper {

    @Override
    public SimplePersonDto toDto(SimplePersonEntity simplePersonEntity) {
        if ( simplePersonEntity == null ) {
            return null;
        }

        SimplePersonDto.SimplePersonDtoBuilder simplePersonDto = SimplePersonDto.builder();

        simplePersonDto.name( simplePersonEntity.getName() );
        simplePersonDto.surName( simplePersonEntity.getSurName() );
        simplePersonDto.age( simplePersonEntity.getAge() );
        simplePersonDto.birthDate( simplePersonEntity.getBirthDate() );

        return simplePersonDto.build();
    }

    @Override
    public List<SimplePersonDto> toDtoList(List<SimplePersonEntity> simplePersonEntity) {
        if ( simplePersonEntity == null ) {
            return null;
        }

        List<SimplePersonDto> list = new ArrayList<SimplePersonDto>( simplePersonEntity.size() );
        for ( SimplePersonEntity simplePersonEntity1 : simplePersonEntity ) {
            list.add( toDto( simplePersonEntity1 ) );
        }

        return list;
    }

    @Override
    public SimplePersonEntity toEntity(SimplePersonDto simplePersonDto) {
        if ( simplePersonDto == null ) {
            return null;
        }

        SimplePersonEntity.SimplePersonEntityBuilder simplePersonEntity = SimplePersonEntity.builder();

        simplePersonEntity.name( simplePersonDto.getName() );
        simplePersonEntity.surName( simplePersonDto.getSurName() );
        simplePersonEntity.age( simplePersonDto.getAge() );
        simplePersonEntity.birthDate( simplePersonDto.getBirthDate() );

        return simplePersonEntity.build();
    }
}
