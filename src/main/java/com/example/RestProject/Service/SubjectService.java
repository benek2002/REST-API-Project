package com.example.Rest_lab_09.Service;

import com.example.Rest_lab_09.Repository.StudentRepository;
import com.example.Rest_lab_09.Repository.SubjectRepository;
import com.example.Rest_lab_09.Student;
import com.example.Rest_lab_09.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {
    public final SubjectRepository subjectRepository;
    public final StudentRepository studentRepository;
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject assignStudentToSubject(int subjectId, int studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        List<Student> studentList = subject.getStudents();
        studentList.add(student);
        subject.setStudents(studentList);
        return subjectRepository.save(subject);
    }
}
