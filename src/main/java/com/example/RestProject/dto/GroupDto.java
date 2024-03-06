package com.example.Rest_lab_09.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Builder
@Getter
public class GroupDto {
    private int id;
    private String nazwaGrupy;
    private double max;


}
