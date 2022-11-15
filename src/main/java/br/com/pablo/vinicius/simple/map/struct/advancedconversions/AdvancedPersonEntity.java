package br.com.pablo.vinicius.simple.map.struct.advancedconversions;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter
@ToString
public class AdvancedPersonEntity {

    private String name;
    private String surName;
    private Long age;
    private Date birthDate;
}
