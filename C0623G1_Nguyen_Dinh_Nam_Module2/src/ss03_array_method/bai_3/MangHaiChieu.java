package ss03_array_method.bai_3;

public class MangHaiChieu {
    public static void tbcSoChan(int[][] array) {
        double tbc;
        double sum = 0;
        double count = 0;
        System.out.print("Phan tu mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                    count++;
                }
            }
        }
        System.out.println();
        if (count==0){
            System.out.println("Khong co so chan nao");
        }else {
            tbc = sum/count;
            System.out.println("Trung binh cong cac so chan: "+ tbc);
        }
    }
}
