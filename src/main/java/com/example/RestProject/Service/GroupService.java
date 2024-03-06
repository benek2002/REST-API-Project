package com.example.Rest_lab_09.Service;


import com.example.Rest_lab_09.Groups;
import com.example.Rest_lab_09.Repository.GroupRepository;
import com.example.Rest_lab_09.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository groupRepository;

    public Groups addClass(Groups group){
        return groupRepository.save(group);
    }
    public List<Groups> findAllClass(){
        return groupRepository.findAll();
    }
    public void deleteClass(int id){
        groupRepository.deleteById(id);
    }

    public Groups getGroup(int id) {
        return groupRepository.findById(id).orElseThrow();
    }
}
