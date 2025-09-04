package mg.yoan.grades;

import lombok.AllArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
public class Teacher {
    private int id;
    private String lastName;
    private String firstName;
    private Instant birthDate;
    private String email;
    private String phone;
    private String specialty;
}
