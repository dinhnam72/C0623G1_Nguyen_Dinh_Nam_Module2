package ss03_array_method.bai_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int doDai;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap do dai mang: ");
            doDai = Integer.parseInt(scanner.nextLine());
            if (doDai <= 0) {
                System.out.println("Yeu cau nhap mang co do dai lon hon 0");
            }
        } while (doDai <= 0);
        int[] array = new int[doDai];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phan tu thu "+i+ ": ");
              array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Trung binh cong: "+TrungBinhCong.ketQua(array));
    }
}
