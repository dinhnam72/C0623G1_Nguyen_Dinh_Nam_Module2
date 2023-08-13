package ss08_clean_code.mvc.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Student extends Person {
    private String classStudent;
    private double score;

    public Student() {
    }

    public Student(String id) {
        super(id);
    }

    public Student(String id, String name, LocalDate dayOfBirth, String gender, String classStudent, double score) {
        super(id, name, dayOfBirth, gender);
        this.classStudent = classStudent;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", classStudent='" + classStudent + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(super.getId(), student.getId());
    }

}
