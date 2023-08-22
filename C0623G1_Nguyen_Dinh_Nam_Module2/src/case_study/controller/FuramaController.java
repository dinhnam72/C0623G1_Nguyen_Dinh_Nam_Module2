package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Furama Manager-------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Input number: ");
            int select;
            try {
                select =Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You must enter the number");
                continue;
            }
            switch (select){
                case 1:
                    EmployeeController.showMenuEmployee();
                    break;
                case 2:
                    CustomerController.showMenuCustomer();
                    break;
                case 3:
                    FacilityController.showMenuFacility();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Number does not exist in the system");
            }
        }while (true);
    }
}
