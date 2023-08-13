package ss08_clean_code.mvc.controller;

import ss08_clean_code.mvc.service.IStudentService;
import ss08_clean_code.mvc.service.ITeacherService;
import ss08_clean_code.mvc.service.StudentService;
import ss08_clean_code.mvc.service.TeacherService;

import java.util.Scanner;

public class ManagerialController {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Managerial---");
            System.out.println("1. Student Manager");
            System.out.println("2. Teacher Manager");
            System.out.print("Input number: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    StudentController.showStudent();
                    break;
                case 2:
                    TeacherController.showTeacher();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Enter the wrong number");
            }
        } while (true);
    }
}
