package ss08_clean_code;

public class CleanCode {
    public int sumAll(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        return sum;
    }
    public void employeeDetails(Empluyee empluyee){}

    public boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public void getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay");
                break;
            case 2:
                if (isLeapYear(year)) {
                    System.out.println("Thang " + month + " nam " + year + " co 29 ngay");
                } else {
                    System.out.println("Thang " + month + " nam " + year + " co 28 ngay");
                }
                break;
            default:
                System.out.println("Thang " + month + " khong ton tai");
        }
    }
}
