package com.demo.springmanytomany.models.case2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String field;

    @OneToMany(mappedBy = "courseModel")
    Set<StudentCourseHistory> history;

}










