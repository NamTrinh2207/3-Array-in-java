import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int[] money;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a length :");
            length = input.nextInt();
            if (length > 20) {
                System.out.println("length should not exceed 20");
            }
        } while (length > 20);

        money = new int[length];
        for (int i = 0; i < money.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            money[i] = input.nextInt();
        }

        System.out.print("Property list : ");
        for (int j : money
        ) {
            System.out.print(j + " billion dollars; ");
        }

        int moneyMax = money[0];
        int position = 1;
        for (int i = 0; i < money.length; i++) {
            if (moneyMax < money[i]) {
                moneyMax = money[i];
                position = i + 1;
            }
        }
        System.out.println(" ");
        System.out.println("The largest property value in the list is : " + moneyMax + " billion dollars");
        System.out.println("position :  " + position);

    }
}