package case_study.controller;

import case_study.service.FacilityService;
import case_study.service.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public static void showMenuFacility() {
        IFacilityService facilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Facility Manager-------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            int select;
            try {
                System.out.print("Input number: ");
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                continue;
            }
            switch (select) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    do {
                        System.out.println("1. Add New Villa");
                        System.out.println("2. Add New House");
                        System.out.println("3. Add New Room");
                        System.out.println("4. Back to menu");
                        int select1;
                        try {
                            System.out.print("Input number: ");
                            select1 = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("You must enter the number");
                            continue;
                        }
                        switch (select1) {
                            case 1:
                                facilityService.addVilla();
                                break;
                            case 2:
                                facilityService.addHouse();
                                break;
                            case 3:
                                facilityService.addRoom();
                                break;
                            case 4:
                                showMenuFacility();
                            default:
                                System.out.println("Number does not exist in the system");
                        }
                    } while (true);
                case 3:
                    facilityService.facilityMaintenance();
                    break;
                case 4:
                    facilityService.remove();
                    break;
                case 5:
                    FuramaController.showMenu();
                default:
                    System.out.println("Number does not exist in the system");
            }
        } while (true);
    }
}
