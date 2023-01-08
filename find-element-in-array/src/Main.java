import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Danh sách học sinh : ");
        String[] student = {"Nam", "Hoàng", "Huy", "Lực", "Tuấn", "Đoàn", "Triệu", "Phúc", "Quân", "Tùng", "Tân", "Nguyên"};
        for (String j : student) {
            System.out.print(j + "  ");
        }
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Nhập tên học sinh : ");
        String input_name = input.nextLine();

        boolean checkName = false;
        int i = 0;
        for (; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                checkName = true;
                break;
            }
        }
        if (checkName) {
            System.out.println("Học sinh tên : " + input_name);
            System.out.println("Số thứ tự : " + (i + 1));
        } else {
            System.out.println("Không tìm thấy tên học sinh trong danh sách !");
        }
    }
}