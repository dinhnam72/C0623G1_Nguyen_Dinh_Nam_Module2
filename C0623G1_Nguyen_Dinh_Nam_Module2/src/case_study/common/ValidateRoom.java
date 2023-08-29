package case_study.common;

import java.util.Scanner;

public class ValidateRoom {
    private static final String REX_ID_ROOM = "^SVRO-\\d{4}$";
    static Scanner scanner = new Scanner(System.in);
    static boolean flag;
    public static boolean inputAndCheckIdRoom(String id) {
        flag = false;
        if (!id.matches(REX_ID_ROOM)) {
            flag = true;
        }
        return flag;
    }
    public static String inputFreeService(){
        System.out.print("Input free service: ");
        String freeService = scanner.nextLine();
        return freeService;
    }
}
