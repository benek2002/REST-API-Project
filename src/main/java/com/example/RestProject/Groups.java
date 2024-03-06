package com.example.Rest_lab_09;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="claster")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazwaGrupy;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupId")
    private List<Student> students;

    private double max;
    public Groups(){

    }

}










