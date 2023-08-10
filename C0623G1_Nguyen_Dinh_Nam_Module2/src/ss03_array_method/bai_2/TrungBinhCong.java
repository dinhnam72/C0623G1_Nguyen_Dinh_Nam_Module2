package ss03_array_method.bai_2;

public class TrungBinhCong {
    public static double ketQua(int[] array) {
        System.out.print("Phan tu cua mang: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        return sum / count;
    }
}
