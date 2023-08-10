package ss03_array_method.bai_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 6, 7, 9};
        System.out.print("Phan tu cua mang: ");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so muon kiem tra: ");
        int a = Integer.parseInt(scanner.nextLine());
        ViTriXuatHien tanSoXuatHien = new ViTriXuatHien();
        tanSoXuatHien.kiemTra(array, a);
    }
}
