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
        int index_x = 0;
        int index_y = 0;
        int max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    index_x = i;
                    index_y = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
        System.out.println("Vị trí phần tử lớn nhất : arr[" + index_x + "]" + "[" + index_y + "]");
    }
}