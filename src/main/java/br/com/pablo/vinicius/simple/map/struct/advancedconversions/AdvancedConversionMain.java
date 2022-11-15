package br.com.pablo.vinicius.simple.map.struct.advancedconversions;

import java.util.Date;

public class AdvancedConversionMain {

    public static void main(String[] args) {

        AdvancedPersonEntity advancedPersonEntity = AdvancedPersonEntity.builder()
                .name("name")
                .surName("surName")
                .age(20l)
                .birthDate(new Date())
                .build();

        AdvancedPersonDto advancedPersonDto = AdvancedPersonMapper.INSTANCE.toDto(advancedPersonEntity);

        System.out.println(advancedPersonDto);
    }
}
