package ss12_java_collection.controller;

import ss12_java_collection.service.FruitService;
import ss12_java_collection.service.IFruitService;

import java.util.Scanner;

public class FruitController {
    public static void showMenu() {
        IFruitService fruitService = new FruitService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Fruit Manager-----");
            System.out.println("1. Display Fruit");
            System.out.println("2. Add Fruit");
            System.out.println("3. Remove Fruit");
            System.out.println("4. Edit Fruit");
            System.out.println("5. Exit");
            System.out.print("Input number: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    fruitService.displayFruit();
                    break;
                case 2:
                    fruitService.addFruit();
                    break;
                case 3:
                    fruitService.removeFruit();
                    break;
                case 4:
                    fruitService.editFruit();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("So ban nhap khong ton tai");
            }
        } while (true);
    }
}
