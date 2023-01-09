import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 6, 4, 9, 7, 8, 10, 0, 0, 0, 0, 0, 0};
        System.out.println("arr: " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập phần từ cần chèn vào mảng : ");
        int element = input.nextInt();

        System.out.print("Nhập vị trí cần chèn vào mảng : ");
        int index = input.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (index >= arr.length) {
                System.out.println("không chèn được phần tử vào mảng");
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (i == index) {
                        index = i;
                    }
                }
                for (int i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = element;
                System.out.print("new arr: ");
                System.out.println(Arrays.toString(arr));
            }
            break;
        }
    }
}
