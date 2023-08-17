package ss12_java_collection.service;

import ss12_java_collection.model.Fruit;
import ss12_java_collection.repository.FruitRepo;
import ss12_java_collection.repository.IFruitRepo;

import java.util.Map;
import java.util.Scanner;

public class FruitService implements IFruitService {
    private static IFruitRepo fruitRepo = new FruitRepo();

    @Override
    public void displayFruit() {
        Map<String, Fruit> fruitMap = fruitRepo.getAll();
//        Cach 1:
//        for (String key:fruitMap.keySet()){
//            System.out.println(key+ " - "+ fruitMap.get(key));
//        }
//        Cach 2
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addFruit() {
        String key;
        do {
            System.out.print("Nhap key: ");
            key = scanner.nextLine();
            if (fruitRepo.checkKey(key)) {
                System.out.println("Key " + key + " da ton tai!");
            }
        } while (fruitRepo.checkKey(key));
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
        Fruit fruit = new Fruit(name, type, dateOfManufacture, expirationDate, made, price);
        fruitRepo.addFruit(key, fruit);

    }

    @Override
    public void removeFruit() {
        String key;
        do {
            System.out.print("Nhap key can xoa: ");
            key = scanner.nextLine();
            if (!fruitRepo.checkKey(key)) {
                System.out.println("Key " + key + "khong ton tai");
            }
        }while (!fruitRepo.checkKey(key));

        fruitRepo.removeFruit(key);
    }

    @Override
    public void editFruit() {
        String key;
        do {
            System.out.print("Nhap key: ");
            key = scanner.nextLine();
            if (!fruitRepo.checkKey(key)) {
                System.out.println("Key " + key + " khong ton tai!");
            }
        } while (!fruitRepo.checkKey(key));
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
        Fruit fruit = new Fruit(name, type, dateOfManufacture, expirationDate, made, price);
        fruitRepo.editFruit(key,fruit);
    }
}
