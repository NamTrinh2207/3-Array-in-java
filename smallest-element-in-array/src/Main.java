import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng : ");
        int length = input.nextInt();
        int[] arr = new int[length];

        System.out.println("Nhập các phần tử của mảng :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("arr: "+ Arrays.toString(arr));
        System.out.println("Phần tử nhỏ nhất trong arr : " + min);
    }
}