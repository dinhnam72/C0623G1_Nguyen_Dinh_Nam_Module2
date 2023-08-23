package case_study.common;

import java.util.Scanner;

public class ValidateCustomer {
    private static final String REX_ID = "^KH-\\d{4}$";
    private static final String REX_TYPE = "^D|P|G|S|M$";
    static final Scanner sc = new Scanner(System.in);
    public static boolean validateIdCustomer(String id) {
        boolean flag = false;
        if (!id.matches(REX_ID)) {
            flag = true;
        }
        return flag;
    }
    public static String inputAndCheckType(){
        String type;
        do {
            System.out.print("Input type: ");
            type = sc.nextLine();
            if (!type.matches(REX_TYPE)){
                System.out.println("Enter the wrong position type");
            }
        }while (!type.matches(REX_TYPE));
        return type;
    }
    public static String inputAddress(){
        System.out.print("Input address: ");
        String address = sc.nextLine();
        return address;
    }
}
