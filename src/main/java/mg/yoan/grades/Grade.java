package mg.yoan.grades;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
public class Grade {
    private Student student;
    private Instant date;
    private double grade;


    double getExamGrade(Exam exam, Student student, Instant t) {
        return

    }


    double getCourseGrade(Course course, Student student, Instant t) {
        return course.getGrades().stream()
                .filter(g -> g.getStudent() == student)
                .map(g -> g.getDate().isBefore(t))
                .mapToDouble(g ->getGrade())
                .reduce(0, (subtotal, element) -> subtotal + element)/course.getGrades().size();

    }



}
