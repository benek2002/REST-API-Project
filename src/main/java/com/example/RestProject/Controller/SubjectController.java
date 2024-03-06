package com.example.Rest_lab_09.Controller;

import com.example.Rest_lab_09.Service.SubjectService;
import com.example.Rest_lab_09.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subjects")
public class SubjectController {
    public final SubjectService subjectService;
    @PostMapping("/save")
    public Subject addSubject(@RequestBody Subject subject){
        return subjectService.addSubject(subject);
    }
    @GetMapping
    public List<Subject> findAll(){
        return subjectService.findAll();
    }
    @PutMapping("/{subjectId}/student/{studentId}")
    public Subject assignStudentToSubject(@PathVariable int subjectId, @PathVariable int studentId){
        return subjectService.assignStudentToSubject(subjectId, studentId);
    }
}
