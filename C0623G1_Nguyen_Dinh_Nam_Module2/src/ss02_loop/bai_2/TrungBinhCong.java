package ss02_loop.bai_2;

import java.util.Scanner;

public class TrungBinhCong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So thu nhat: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("So thu hai: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + uSCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + bSCNN(a, b));
        System.out.println("Trung bình cộng: " + tBC(uSCLN(a, b), bSCNN(a, b)));
    }

    public static int uSCLN(int a, int b) {
        if (b == 0) return a;
        return uSCLN(b, a % b);
    }

    public static int bSCNN(int a, int b) {
        return (a * b) / uSCLN(a, b);
    }

    public static double tBC(int uSCLN, int bSCLN) {
        return (uSCLN + bSCLN) / 2.0;
    }
}
