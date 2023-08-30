package case_study.controller;

import case_study.service.CustomerService;
import case_study.service.interface_service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void showMenuCustomer(){
        ICustomerService customerService = new CustomerService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Customer Manager-------");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
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
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    System.out.println("Successfully added customer");
                    break;
                case 3:
                    customerService.edit();
                    System.out.println("Successful customer information milk");
                    break;
                case 4:
                    customerService.remove();
                    System.out.println("Delete customer successfully");
                    break;
                case 5:
                    customerService.searchByName();
                    break;
                case 6:
                    FuramaController.showMenu();
                default:
                    System.out.println("Number does not exist in the system");
            }
        } while (true);
    }
}
