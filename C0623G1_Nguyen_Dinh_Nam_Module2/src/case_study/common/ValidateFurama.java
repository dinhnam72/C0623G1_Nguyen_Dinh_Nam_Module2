package case_study.common;

import java.util.Scanner;

public class ValidateFurama {
    private static final String REX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String REX_TYPE = "^Y|M|W|D|H$";
    static final Scanner sc = new Scanner(System.in);
    static boolean flag;

    public static String inputAndCheckName() {
        String name;
        do {
            System.out.print("Input name: ");
            name = sc.nextLine();
            if (!name.matches(REX_NAME)) {
                System.out.println("Employee name must capitalize first letter");
            }
        } while (!name.matches(REX_NAME));
        return name;
    }

    public static double inputAndCheckArea() {
        double area = 0;
        do {
            flag = false;
            try {
                System.out.print("Input area: ");
                area = Double.parseDouble(sc.nextLine());
                if (area <= 30) {
                    System.out.println("Usable area is more than 30m2");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                flag = true;
            }

        } while (flag);
        return area;
    }

    public static int inputAndCheckCosts() {
        int costs = 1;
        do {
            flag = false;
            try {
                System.out.print("Input costs: ");
                costs = Integer.parseInt(sc.nextLine());
                if (costs <= 0) {
                    System.out.println("The rental cost must be a positive number");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                flag = true;
            }
        } while (flag);
        return costs;
    }

    public static int inputAndCheckMaxPerson() {
        int maxPerson = 0;
        do {
            flag = false;
            try {
                System.out.print("Input max person: ");
                maxPerson = Integer.parseInt(sc.nextLine());
                if (maxPerson < 1 || maxPerson >= 20) {
                    System.out.println("0<Max person<20");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter the number");
                flag = true;
            }
        } while (flag);
        return maxPerson;
    }

    public static String inputAndCheckType() {
        String type;
        do {
            System.out.print("Input type: ");
            type = sc.nextLine();
            if (!type.matches(REX_TYPE)) {
                System.out.println("The type is not in the correct format (H|D|W|M|Y)");
            }
        } while (!type.matches(REX_TYPE));
        return type;
    }
}
