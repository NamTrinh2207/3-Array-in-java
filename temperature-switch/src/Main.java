import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter fahrenheit: ");
                celsius = input.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + degreesFtoC(celsius));
                break;
            } else if (choice == 2) {
                System.out.print("Enter Celsius: ");
                fahrenheit = input.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + degreesCtoF(fahrenheit));
                break;
            }
        } while (choice != 0);
    }

    public static double degreesCtoF(double celsius) {
        return (9.0 / 5) * (celsius + 32);
    }

    public static double degreesFtoC(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}