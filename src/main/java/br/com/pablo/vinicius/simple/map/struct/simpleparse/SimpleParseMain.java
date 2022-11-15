package br.com.pablo.vinicius.simple.map.struct.simpleparse;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SimpleParseMain {

    public static void main(String[] args) {

        // Example Entity To Dto
        SimplePersonEntity simplePersonEntity = SimplePersonEntity.builder()
                .age(29l)
                .birthDate(LocalDate.now())
                .name("name")
                .surName("surName")
                .build();

        SimplePersonDto simplePersonDto = SimplePersonMapper.INSTANCE.toDto(simplePersonEntity);
        System.out.println(simplePersonDto);


        //Example Dto To Entity
        SimplePersonDto dtoPerson = SimplePersonDto.builder()
                .age(20l)
                .name("name")
                .surName("surName")
                .birthDate(LocalDate.now())
                .build();

        SimplePersonEntity entityPerson = SimplePersonMapper.INSTANCE.toEntity(dtoPerson);
        System.out.println(entityPerson);


        //Example Entity to Dto - List
        List<SimplePersonEntity> simplePersonEntityList = Arrays.asList(
                SimplePersonEntity.builder()
                    .birthDate(LocalDate.now())
                    .age(20l)
                    .surName("surName")
                    .name("name")
                    .build(),
                SimplePersonEntity.builder()
                        .birthDate(LocalDate.now())
                        .age(29l)
                        .surName("de Barro")
                        .name("Joao")
                        .build());

        List<SimplePersonDto> personDtos = SimplePersonMapper.INSTANCE.toDtoList(simplePersonEntityList);

        System.out.println(personDtos);

    }

}
