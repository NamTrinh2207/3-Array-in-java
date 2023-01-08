import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        System.out.println("arr : " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa :");
        int index = input.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
                index_del = i;
            }
        }
        System.out.println("Vị trí của phần tử cần xóa là : " + index_del);
        if (index_del == arr.length - 1) {
            arr[arr.length - 1] = 0;
        } else {
            for (int i = index_del; i < arr.length; i++) {
                arr[i] = arr[i + 1];
                if (i == arr.length - 2) {
                    arr[arr.length - 1] = 0;
                    break;
                }
            }
        }
        System.out.print("new arr: ");
        System.out.println(Arrays.toString(arr));
    }
}