package mg.yoan.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
    private List<Grade> grades;
    private List<Exam> exams;



}
