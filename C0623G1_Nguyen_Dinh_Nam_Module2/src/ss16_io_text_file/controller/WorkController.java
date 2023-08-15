package ss16_io_text_file.controller;

import ss16_io_text_file.service.IWorkService;
import ss16_io_text_file.service.WorkService;

import java.util.Scanner;

public class WorkController {
    public static void showMenu() {
        IWorkService workService = new WorkService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Manager---");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Edit");
            System.out.println("5. Search to id");
            System.out.println("6. Search to name");
            System.out.println("7. Sort to name");
            System.out.println("8. Sort to money");
            System.out.println("9. Exit");
            System.out.print("Nhap so: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    workService.display();
                    break;
                case 2:
                    workService.add();
                    break;
                case 3:
                    workService.remove();
                    break;
                case 4:
                    workService.edit();
                    break;
                case 5:
                    workService.searchToId();
                    break;
                case 6:
                    workService.searchToName();
                    break;
                case 7:
                    workService.sortToName();
                    break;
                case 8:
                    workService.sortToMoney();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("So ban nhap khong co");
            }
        } while (true);
    }
}
