package br.com.pablo.vinicius.simple.map.struct.intermediateconversions;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@Getter
@ToString
public class IntermediatePersonEntity {

    private String name;
    private String surName;
    private Long age;
    private LocalDate birthDate;
}
