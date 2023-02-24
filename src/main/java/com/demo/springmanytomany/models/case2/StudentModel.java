package com.demo.springmanytomany.models.case2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "studentModel")
    private Set<StudentCourseHistory> history;


}
