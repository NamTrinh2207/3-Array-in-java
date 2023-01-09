import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String inputs = input.next();

        System.out.print("Ký tự cần đếm: ");
        char chars = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputs.length(); i++) {
            if (chars == inputs.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + chars + ": là " + count);
    }
}