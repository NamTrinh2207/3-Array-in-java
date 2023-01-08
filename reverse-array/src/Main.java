import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int length;
        int[] array;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Enter a length:");
            length = input.nextInt();
            if (length > 20)
                System.out.println("length does not exceed 20");
        } while (length > 20);
        array = new int[length];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }


        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k : array) {
            System.out.print(k+" ");
        }


        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[length - 1 - j];
            array[length - 1 - j] = temp;
        }
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}