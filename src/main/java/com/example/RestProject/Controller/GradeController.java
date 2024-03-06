package com.example.Rest_lab_09.Controller;


import com.example.Rest_lab_09.Grade;
import com.example.Rest_lab_09.Service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/grades")
public class GradeController {
    public final GradeService gradeService;
    @GetMapping("")
    public List<Grade> findAll(){
        return gradeService.findAll();
    }
    @PostMapping("")
    public Grade addGrade(@RequestBody Grade grade){
        return gradeService.addGrade(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable int id){
        gradeService.deleteGrade(id);
    }
}
