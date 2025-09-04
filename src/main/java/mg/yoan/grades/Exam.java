package mg.yoan.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant examDate;
    private int coefficient;

}
