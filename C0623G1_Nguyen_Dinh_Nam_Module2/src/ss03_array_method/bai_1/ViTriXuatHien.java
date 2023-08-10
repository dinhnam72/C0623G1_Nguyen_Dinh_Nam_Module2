package ss03_array_method.bai_1;

public class ViTriXuatHien {
    public void kiemTra(int[] arr, int x) {
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(x + " khong ton tai trong mang");
        } else {
            System.out.println("Vi tri cua " + x + " xuat hien: " + index);
        }
    }
}
