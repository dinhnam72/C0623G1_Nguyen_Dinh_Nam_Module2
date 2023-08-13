package ss08_clean_code.mvc.repository;

import ss08_clean_code.mvc.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    int checkId(String id);
    void addStudent(Student student);
    void removeStudent(String id);

}
