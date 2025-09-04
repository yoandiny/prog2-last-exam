package mg.yoan.grades;

import lombok.AllArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant examDate;
    private int coefficient;


