import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào số dòng của ma trận: ");
        x = input.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        y = input.nextInt();

        int[][] arr = new int[x][y];
        System.out.println("Nhập các phần tử cho ma trận: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        total(arr);
    }

    public static void total(int[][] arr) {
        Scanner input = new Scanner(System.in);
        int total;
        int sum = 0;
        System.out.println("Nhập cột muốn tính tổng : ");
        total = input.nextInt();

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][total - 1];
        }
        System.out.println("Tổng của cột số " + total + " là: " + sum);
    }
}