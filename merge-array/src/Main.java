import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tao mang 1
        int[] arr1 = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("element arr1 to " + (i + 1) + ": ");
            int elementArr1 = input.nextInt();
            arr1[i] = elementArr1;
        }

        //tao mang 2
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("element arr2 to " + (i + 1) + ": ");
            int elementArr2 = input.nextInt();
            arr2[i] = elementArr2;
        }

        //Tao mang 3
        int lengthArr3 = arr1.length + arr2.length;
        int[] arr3 = new int[lengthArr3];
        int n = 0;
        for (int i : arr1) {
            arr3[n] = i;
            n++;
        }
        for (int i : arr2) {
            arr3[n] = i;
            n++;
        }
        System.out.print("arr1 : ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("arr2 : ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("arr3 : ");
        System.out.println(Arrays.toString(arr3));
    }
}