package com.example.Rest_lab_09.Service;

import com.example.Rest_lab_09.Grade;
import com.example.Rest_lab_09.Repository.GradeRepository;
import com.example.Rest_lab_09.Repository.StudentRepository;
import com.example.Rest_lab_09.Repository.SubjectRepository;
import com.example.Rest_lab_09.Student;
import com.example.Rest_lab_09.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {
    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    public List<Grade> findAll() {
        return gradeRepository.findAll();
    }

    public Grade addGrade(Grade grade) {
        return gradeRepository.save(grade);
    }





    public void deleteGrade(int id) {
        gradeRepository.deleteById(id);
    }


}
