package com.example.Rest_lab_09;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String surName;
    private String studentState;
    private String nrIndex;
    private String email;

    private int groupId;

    @JsonIgnore
    @ManyToMany(mappedBy = "students")
    private List<Subject> subjects;
    public Student(){

    }

}
