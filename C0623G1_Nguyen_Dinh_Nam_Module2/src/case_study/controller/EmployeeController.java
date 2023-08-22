package case_study.controller;

import case_study.service.EmployeeService;
import case_study.service.interface_service.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void showMenuEmployee() {

        IEmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Employee Manager-------");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.print("Input number: ");
            int select;
            try {
                select = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                continue;
            }
            switch (select) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.remove();
                    break;
                case 5:
                    employeeService.searchByName();
                    break;
                case 6:
                    FuramaController.showMenu();
                default:
                    System.out.println("Number does not exist in the system");
            }
        } while (true);
    }
}
