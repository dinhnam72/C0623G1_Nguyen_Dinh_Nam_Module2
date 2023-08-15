package ss19_string_regex;

public class ValidateEmail {
    public static void main(String[] args) {
        String test1 = "asdaa@sdfds.sdfsdf";
        String test2 = "Asdas3432dsa@sdfds.sdfsdf";
        String test3 = "asAD343dasdsa@gmail.c";
        System.out.print(test1 + " : ");
        checkString(test1);
        System.out.print(test2 + " : ");
        checkString(test2);
        System.out.print(test3 + " : ");
        checkString(test3);

    }

    private static final String REX = "^\\w{6,32}@\\w{2,12}\\.\\w{2,12}";

    public static void checkString(String str) {
        if (str.matches(REX)) {
            System.out.println("Chuoi hop le");
        } else {
            System.out.println("Chuoi khong hop le");
        }
    }
}
