package mg.yoan.grades;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Grade {
    private Student student;
    private Instant date;
    private double grade;


    double getCourseGrade(Course course, Student student, Instant t) {
        return course.getGrades().stream()
                .filter(g -> g.getStudent() == student)
                .map(g -> g.getDate().isBefore(t))
                .mapToDouble(g ->getGrade())
                .reduce(0, (subtotal, element) -> subtotal + element);

    }

    double getExamGrade(Exam exam, Student student, Instant t) {

    }

}
