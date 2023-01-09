import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào số dòng, cột của ma trận: ");
        x = input.nextInt();

        int[][] arr = new int[x][x];
        System.out.println("Nhập các phần tử cho ma trận: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        total(arr);
    }

    public static void total(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][j];
        }
        System.out.println("Tổng của đường chéo chính là : " + sum);
    }
}