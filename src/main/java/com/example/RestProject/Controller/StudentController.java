package com.example.Rest_lab_09.Controller;

import com.example.Rest_lab_09.Service.StudentService;
import com.example.Rest_lab_09.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    @GetMapping("")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @PostMapping("")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
    @PutMapping("/{studentId}/subject/{subjectId}")
    public Student assignSubjectToStudent(@PathVariable int studentId, @PathVariable int subjectId){
        return studentService.assignSubjectToStudent(studentId, subjectId);

    }
    @GetMapping("/{studentId}")
    public String getStudentGrades(@PathVariable int studentId){
        return studentService.getStudentGrades(studentId);
    }
}
