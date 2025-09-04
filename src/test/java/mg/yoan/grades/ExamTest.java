package mg.yoan.grades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    static Course math;
    static Course pc;
    static Student john;

    @BeforeEach
    void setUp() {
        var mathGrades = new ArrayList<Grade>();
        var physicsGrades = new ArrayList<Grade>();

        var mrJean = new Teacher(1, "Rakoto", "Jean", Instant.now(), "jean@jean.com"
        , "0325649875", "Mathematician");
         math = new Course(1, "MATH", 6, mrJean, mathGrades);
        var mrJao = new Teacher(1, "DANUO", "JAOVARY", Instant.now(), "jaovary@test.com"
                , "0325649875", "Physician");
         pc = new Course(2, "PHYSICS", 6, mrJao, physicsGrades);
        var alicia = new Tutor(1, "Cyndie", "Alicia", Instant.now(), "alicia@cyndie.mg"
        , "0325649875", "Mother of john");
         john = new Student(1, "John", "Doe", Instant.now(), "john@doe.com"
        , "0356489657", "K1", alicia);
    }

    @Test
    @DisplayName("Get instant student exam grade")
    void getExamGrade() {

    }
}