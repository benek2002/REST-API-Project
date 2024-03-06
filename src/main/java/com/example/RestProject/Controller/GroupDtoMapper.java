package com.example.Rest_lab_09.Controller;

import com.example.Rest_lab_09.Groups;
import com.example.Rest_lab_09.dto.GroupDto;

import java.util.List;

public class GroupDtoMapper {
    private GroupDtoMapper(){

    }
    public static List<GroupDto> mapToGroupsDtos(List<Groups> groups) {
        return groups.stream()
                .map(group -> mapToGroupsDto(group))
                .toList();
    }

    private static GroupDto mapToGroupsDto(Groups group) {
        return GroupDto.builder()
                .id(group.getId())
                .nazwaGrupy(group.getNazwaGrupy())
                .max(group.getMax())
                .build();
    }
}
