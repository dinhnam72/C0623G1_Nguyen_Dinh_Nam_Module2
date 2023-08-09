package ss02_loop.bai_1;

import java.util.Scanner;

public class TongUocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So muon tim uoc: ");
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum += i;
                System.out.println("Uoc cua " + a + ": " + i);
            }
        }
        System.out.println("Tong uoc so cua " + a + ": " + sum);
    }
}
