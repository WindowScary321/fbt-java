package BasicStuffs.bai3_oopStuffs;

import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    public int inputInt(String msg, int min, int max) {
        int num;
        do {
            System.out.println(msg);
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num < min || num > max) {
                    System.out.println("Out of range, vui lòng nhập lại.");
                } else {
                    break; // chỉ thoát khi hợp lệ
                }
            } catch (Exception e) {
                System.out.println("Sai kiểu dữ liệu!!! Vui lòng thử lại.");
                scanner.nextLine(); // dọn sạch buffer
            }
        } while (true);
        return num;
    }
}
