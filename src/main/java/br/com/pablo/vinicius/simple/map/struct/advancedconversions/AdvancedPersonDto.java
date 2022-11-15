package br.com.pablo.vinicius.simple.map.struct.advancedconversions;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class AdvancedPersonDto {

    private String name;
    private String surName;
    private Long age;
    private AdvancedExtraInfos advancedExtraInfos;
}
