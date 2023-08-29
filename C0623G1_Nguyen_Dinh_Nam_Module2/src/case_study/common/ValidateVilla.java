package case_study.common;

import java.util.Scanner;

public class ValidateVilla {
    private static final String REX_ID_VILLA = "^SVVL-\\d{4}$";
    private static final String REX_STANDARD = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    static Scanner scanner = new Scanner(System.in);
    static boolean flag;

    public static boolean inputAndCheckIdVilla(String id) {
        flag = false;
        if (!id.matches(REX_ID_VILLA)) {
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

    public static double inputAndCheckSwimmingArea() {
        double swimmingArea = 0.0;
        do {
            flag = false;
            try {
                System.out.print("Input swimming area: ");
                swimmingArea = Double.parseDouble(scanner.nextLine());
                if (swimmingArea <= 30) {
                    System.out.println("Swimming area is more than 30m2");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                flag = true;
            }
        } while (flag);
        return swimmingArea;
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
