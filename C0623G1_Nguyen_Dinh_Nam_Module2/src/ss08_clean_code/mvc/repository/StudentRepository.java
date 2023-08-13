package ss08_clean_code.mvc.repository;

import ss08_clean_code.mvc.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    public static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("ST-01", "Nguyen Thi C", LocalDate.parse("15/04/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nu", "91", 8.1));
        studentList.add(new Student("ST-02", "Nguyen Van A", LocalDate.parse("20/05/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nam", "91", 7.1));
        studentList.add(new Student("ST-03", "Nguyen Van C", LocalDate.parse("10/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nu", "91", 6.5));
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public int checkId(String id) {
        int index = studentList.indexOf(new Student(id));
        return index;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(String id) {
        studentList.remove(checkId(id));
    }
}
