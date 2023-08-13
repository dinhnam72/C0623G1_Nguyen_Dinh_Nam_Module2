package ss08_clean_code.mvc.repository;

import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.model.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    public static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher("TC-01", "Nguyen Thi D", LocalDate.parse("15/10/1978", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nu", "Van"));
        teacherList.add(new Teacher("TC-02", "Nguyen Hoa A", LocalDate.parse("22/05/1958", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nam", "Toan"));
        teacherList.add(new Teacher("TC-03", "Nguyen Van Lai", LocalDate.parse("10/11/1966", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "nu", "Hoa"));
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public int checkId(String id) {
        int index = teacherList.indexOf(new Teacher(id));
        return index;

    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void removeTeacher(String id) {
        teacherList.remove(checkId(id));
    }
}
