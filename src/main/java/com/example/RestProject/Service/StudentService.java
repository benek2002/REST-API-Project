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
public class StudentService {
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final GradeRepository gradeRepository;
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    public Student save(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }

    public Student assignSubjectToStudent(int studentId, int subjectId) {
        List<Subject> subjectList = null;
        Student student = studentRepository.findById(studentId).get();
        Subject subject = subjectRepository.findById(subjectId).get();
        subjectList = student.getSubjects();
        subjectList.add(subject);
        student.setSubjects(subjectList);
        return studentRepository.save(student);
    }

    public String getStudentGrades(int studentId) {
        List<Grade> grades = gradeRepository.findByStudentId(studentId);
        String allGrades = new String();
        for(Grade grade : grades){
            allGrades.concat("Subject: " + String.valueOf(grade.getSubject_id()) +", grade: " + String.valueOf(grade.getGrade()) + "\n");
        }
        return allGrades;
    }
}
