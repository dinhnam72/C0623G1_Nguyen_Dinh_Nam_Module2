package ss08_clean_code.mvc.service;

import ss08_clean_code.mvc.controller.ManagerialController;
import ss08_clean_code.mvc.controller.StudentController;
import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.repository.IStudentRepository;
import ss08_clean_code.mvc.repository.StudentRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static IStudentRepository studentRepository = new StudentRepository();

    @Override
    public void displayStudent() {
        for (Student student : studentRepository.getAll()) {
            System.out.println(student);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudent() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (studentRepository.checkId(id) != -1) {
                System.out.println("Duplicate id");
            }
        } while (studentRepository.checkId(id) != -1);

        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input day of birth: ");
        LocalDate dayOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Input gender: ");
        String gender = scanner.nextLine();
        System.out.print("Input class: ");
        String classStudent = scanner.nextLine();
        System.out.print("Input score: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dayOfBirth, gender, classStudent, score);
        studentRepository.addStudent(student);
    }

    @Override
    public void removeStudent() {
        String id;
        do {
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (studentRepository.checkId(id) == -1) {
                System.out.println("Id doesn't match");
                continue;
            }
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Input number:");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    studentRepository.removeStudent(id);
                    break;
                case 2:
                    StudentController.showStudent();
                default:
                    System.out.println("Enter the wrong number");
                    removeStudent();
            }
        } while (studentRepository.checkId(id) == -1);

    }
}
