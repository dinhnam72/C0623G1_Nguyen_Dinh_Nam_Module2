package ss10_list.controller;

import ss10_list.service.FruitService;
import ss10_list.service.IFruitService;

import java.util.Scanner;

public class FruitController {
    public static void showMenu(){
        IFruitService fruitService = new FruitService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Fruit Manager-----");
            System.out.println("1. Display Fruit");
            System.out.println("2. Add Fruit");
            System.out.println("3. Exit");
            System.out.print("Input number: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    fruitService.display();
                    break;
                case 2:
                    fruitService.add();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("So ban nhap khong ton tai");
            }
        }while (true);
    }
}
