package ss04_class_object;

public class Doctor {
    private String name;
    private int age;
    private String addess;
    private String email;
    private String location;

    public Doctor(String name, int age, String addess, String email, String location) {
        this.name = name;
        this.age = age;
        this.addess = addess;
        this.email = email;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addess='" + addess + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
