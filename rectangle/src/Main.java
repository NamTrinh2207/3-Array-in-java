import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        Retangle retangle = new Retangle(width, height);
        System.out.println(retangle.display());
        System.out.println("Perimeter = " + retangle.getPerimeter());
        System.out.println("Area = " + retangle.getArea());
    }
}