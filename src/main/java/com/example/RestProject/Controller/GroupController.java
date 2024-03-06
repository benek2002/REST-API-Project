package com.example.Rest_lab_09.Controller;

import com.example.Rest_lab_09.Groups;
import com.example.Rest_lab_09.Service.GroupService;
import com.example.Rest_lab_09.Student;
import com.example.Rest_lab_09.dto.GroupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/groups")
public class GroupController {
    private final GroupService groupService;
    @PostMapping("")
    public Groups addClass(@RequestBody Groups group){
        return groupService.addClass(group);
    }
    @GetMapping("")
    public List<GroupDto> getGroups(){
        return GroupDtoMapper.mapToGroupsDtos(groupService.findAllClass());
    }

    @GetMapping("/{id}/students")
    public List<Student> getStudentsFromGroup(@PathVariable int id){
        Groups group = groupService.getGroup(id);
        return group.getStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable int id){
        groupService.deleteClass(id);
    }
    @GetMapping("/{id}/fill")
    public String getGroupFill(@PathVariable int id){
        Groups group = groupService.getGroup(id);
        double percentFill = (group.getStudents().size()/group.getMax()) * 100;
        return String.valueOf(percentFill) + "%";
    }

}
