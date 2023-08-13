package ss08_clean_code.mvc.controller;

import ss08_clean_code.mvc.service.IStudentService;
import ss08_clean_code.mvc.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void showStudent() {
        IStudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Student Manager---");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Return menu");
            System.out.print("Input number: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    studentService.displayStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:
                    studentService.removeStudent();
                    break;
                case 4:
                    ManagerialController.showMenu();
                default:
                    System.out.println("Enter the wrong number");
            }
        } while (true);
    }
}
