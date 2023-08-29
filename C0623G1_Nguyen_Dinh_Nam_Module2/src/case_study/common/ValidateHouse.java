package case_study.common;

import java.util.Scanner;

public class ValidateHouse {
    private static final String REX_ID_HOUSE = "^SVHO-\\d{4}$";
    private static final String REX_STANDARD = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    static Scanner scanner = new Scanner(System.in);
    static boolean flag;

    public static boolean inputAndCheckIdHouse(String id) {
        flag = false;
        if (!id.matches(REX_ID_HOUSE)) {
            flag = true;
        }
        return flag;
    }

    public static String inputAndCheckStandard() {
        String standard;
        do {
            System.out.print("Input standard: ");
            standard = scanner.nextLine();
            if (!standard.matches(REX_STANDARD)) {
                System.out.println("Villa standard must capitalize the first letter");
            }
        } while (!standard.matches(REX_STANDARD));
        return standard;
    }

    public static int inputAndCheckFloor() {
        int floor = 0;
        do {
            flag = false;
            try {
                System.out.print("Input floor: ");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor < 1) {
                    System.out.println("Number of floors must be greater than 0");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                flag = true;
            }
        } while (flag);
        return floor;
    }

}
