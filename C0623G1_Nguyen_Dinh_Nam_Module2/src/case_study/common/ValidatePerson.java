package case_study.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidatePerson {
    private static final String REX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
    private static final String REX_GENDER = "^(Nam)|(Nu)$";
    private static final String REX_IDENTITY_CARD = "^(\\d|\\d{4})\\d{8}$";
    private static final String REX_TELEPHONE = "^0\\d{9}$";
    private static final String REX_EMAIL = "^\\w{6,32}@\\w{2,12}\\.\\w{2,12}$";
    static final Scanner sc = new Scanner(System.in);
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

    public static LocalDate inputAndCheckDayOfBirth() {
        LocalDate date = null;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("Input day of birth: ");
                date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate checkDate = date.plusYears(18);
                LocalDate dateNow = LocalDate.now();
                if (!checkDate.isBefore(dateNow)) {
                    System.out.println("Employees must be 18 years old");
                    flag = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Enter the wrong date format");
                flag = true;
            }

        } while (flag);
        return date;
    }

    public static String inputAndCheckGender() {
        String gender;
        do {
            System.out.print("Input gender: ");
            gender = sc.nextLine();
            if (!gender.matches(REX_GENDER)) {
                System.out.println("Gender is male or female");
            }
        } while (!gender.matches(REX_GENDER));
        return gender;
    }

    public static String inputAndCheckIdentityCard() {
        String identityCard;
        do {
            System.out.print("Input identityCard; ");
            identityCard = sc.nextLine();
            if (!identityCard.matches(REX_IDENTITY_CARD)) {
                System.out.println("Identity card must contain 9 or 12 numbers");
            }
        } while (!identityCard.matches(REX_IDENTITY_CARD));
        return identityCard;
    }

    public static String inputAndCheckTelephone() {
        String telephone;
        do {
            System.out.print("Input telephone: ");
            telephone = sc.nextLine();
            if (!telephone.matches(REX_TELEPHONE)) {
                System.out.println("Phone number must start with 0 and have 10 digits");
            }
        } while (!telephone.matches(REX_TELEPHONE));
        return telephone;
    }

    public static String inputAndCheckEmail() {
        String email;
        do {
            System.out.print("Input email: ");
            email = sc.nextLine();
            if (!email.matches(REX_EMAIL)) {
                System.out.println("Email is not valid");
            }
        } while (!email.matches(REX_EMAIL));
        return email;
    }
}
