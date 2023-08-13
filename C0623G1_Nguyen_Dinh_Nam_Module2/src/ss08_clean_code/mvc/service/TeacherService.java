package ss08_clean_code.mvc.service;

import ss08_clean_code.mvc.controller.StudentController;
import ss08_clean_code.mvc.controller.TeacherController;
import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.model.Teacher;
import ss08_clean_code.mvc.repository.ITeacherRepository;
import ss08_clean_code.mvc.repository.TeacherRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static ITeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teacherRepository.getAll()) {
            System.out.println(teacher);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addTeacher() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (teacherRepository.checkId(id) != -1) {
                System.out.println("Duplicate id");
            }
        } while (teacherRepository.checkId(id) != -1);

        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input day of birth: ");
        LocalDate dayOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Input gender: ");
        String gender = scanner.nextLine();
        System.out.print("Input specialize: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dayOfBirth, gender, specialize);
        teacherRepository.addTeacher(teacher);
    }

    @Override
    public void removeTeacher() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (teacherRepository.checkId(id) == -1) {
                System.out.println("Id doesn't match");
                continue;
            }
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Input number:");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    teacherRepository.removeTeacher(id);
                    break;
                case 2:
                    TeacherController.showTeacher();
                default:
                    System.out.println("Enter the wrong number");
                    removeTeacher();
            }
        } while (teacherRepository.checkId(id) == -1);
    }
}
