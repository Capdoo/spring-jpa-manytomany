package com.demo.springmanytomany.models.case2;

import javax.persistence.*;

@Entity
public class StudentCourseHistory {

    @EmbeddedId
    StudentCourseKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    StudentModel studentModel;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    CourseModel courseModel;

    Integer rating;

    String label;

}
