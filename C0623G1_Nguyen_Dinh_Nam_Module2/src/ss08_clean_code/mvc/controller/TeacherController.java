package ss08_clean_code.mvc.controller;

import ss08_clean_code.mvc.service.ITeacherService;
import ss08_clean_code.mvc.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static void showTeacher(){
        ITeacherService teacherService = new TeacherService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Teacher Manager---");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Return menu");
            System.out.print("Input number: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    teacherService.displayTeacher();
                    break;
                case 2:
                    teacherService.addTeacher();
                    break;
                case 3:
                    teacherService.removeTeacher();
                    break;
                case 4:
                    ManagerialController.showMenu();
                default:
                    System.out.println("Enter the wrong number");
            }
        }while (true);
    }
}
