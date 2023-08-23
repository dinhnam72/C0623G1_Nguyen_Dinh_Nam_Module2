package case_study.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidateEmployee {
    private static final String REX_ID = "^NV-\\d{4}$";
    private static final String REX_DEGREE = "^TC|CD|DH|SDH$";
    private static final String REX_POSITION = "^LT|PV|CV|GS|QL|GD$";
    static final Scanner sc = new Scanner(System.in);
    static boolean flag;

    public static boolean inputAndCheckIdEmployee(String id) {
        flag = false;
        if (!id.matches(REX_ID)) {
            flag = true;
        }
        return flag;

    }

    public static String inputAndCheckDegree() {
        String degree;
        do {
            System.out.print("Input degree: ");
            degree = sc.nextLine();
            if (!degree.matches(REX_DEGREE)) {
                System.out.println("Enter the wrong degree");
            }
        } while (!degree.matches(REX_DEGREE));
        return degree;
    }

    public static String inputAndCheckPosition() {
        String position;
        do {
            System.out.print("Input position: ");
            position = sc.nextLine();
            if (!position.matches(REX_POSITION)) {
                System.out.println("Enter the wrong position");
            }
        } while (!position.matches(REX_POSITION));
        return position;
    }

    public static double inputAndCheckWage() {
        double wage = 0.0;
        do {
            flag = false;
            try {
                System.out.print("Input wage: ");
                wage = Double.parseDouble(sc.nextLine());
                if (wage <= 0) {
                    System.out.println("The wages must be a positive number");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wage must be entered in numbers");
                flag = true;
            }
        } while (flag);

        return wage;
    }
}
