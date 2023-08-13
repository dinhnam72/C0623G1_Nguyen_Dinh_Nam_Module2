package ss08_clean_code.mvc.repository;

import ss08_clean_code.mvc.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();
    int checkId(String id);
    void addTeacher(Teacher teacher);
    void removeTeacher(String id);

}
