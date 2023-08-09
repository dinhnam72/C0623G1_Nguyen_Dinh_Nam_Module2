package ss01_introduction;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so thu hai: ");
        int b = Integer.parseInt(scanner.nextLine());
        PhepTinh phepTinh = new PhepTinh(a, b);
        do {
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.println("5. Exit");

            System.out.print("Nhap so: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    phepTinh.cong();
                    break;
                case 2:
                    phepTinh.tru();
                    break;
                case 3:
                    phepTinh.nhan();
                    break;
                case 4:
                    phepTinh.chia();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("So ban nhap khong dung");
            }
        } while (true);
    }
}
