package ss08_clean_code.mvc.model;

import java.time.LocalDate;
import java.util.Objects;

public class Teacher extends Person {
    private String specialize;

    public Teacher(String id) {
        super(id);
    }

    public Teacher() {

    }

    public Teacher(String id, String name, LocalDate dayOfBirth, String gender, String specialize) {
        super(id, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", specialize='" + specialize + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(super.getId(), teacher.getId());
    }
}
