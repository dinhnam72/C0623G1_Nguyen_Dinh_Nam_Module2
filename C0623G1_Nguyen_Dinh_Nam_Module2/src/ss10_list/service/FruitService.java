package ss10_list.service;

import ss10_list.model.Fruit;
import ss10_list.repository.FruitRepo;
import ss10_list.repository.IFruitRepo;

import java.util.Scanner;

public class FruitService implements IFruitService{
    public static IFruitRepo fruitRepo = new FruitRepo();
    @Override
    public void display() {
        for (Fruit fruit:fruitRepo.getAll()){
            System.out.println(fruit);
        }
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.print("Nhap ten trai cay: ");
        String name = scanner.nextLine();
        System.out.print("Nhap loai trai cay: ");
        String type = scanner.nextLine();
        System.out.print("Nhap ngay san xuat: ");
        String dateOfManufacture = scanner.nextLine();
        System.out.print("Nhap han su dung: ");
        String expirationDate = scanner.nextLine();
        System.out.print("Nhap noi san xuat: ");
        String made = scanner.nextLine();
        System.out.print("Nhap gia trai cay: ");
        double price = Double.parseDouble(scanner.nextLine());
        Fruit fruit = new Fruit(name,type,dateOfManufacture,expirationDate,made,price);
        fruitRepo.add(fruit);
    }
}
