package br.com.pablo.vinicius.simple.map.struct.intermediateconversions;

import java.time.LocalDate;

public class IntermediateConversionsMain {

    public static void main(String[] args) {

        IntermediatePersonEntity intermediatePersonEntity = IntermediatePersonEntity.builder()
                .birthDate(LocalDate.now())
                .name("name")
                .surName("surName")
                .age(20l)
                .build();

        IntermediatePersonDto intermediatePersonDto = IntermediatePersonMapper.INSTANCE.toDto(intermediatePersonEntity);

        System.out.println(intermediatePersonDto);
    }
}
