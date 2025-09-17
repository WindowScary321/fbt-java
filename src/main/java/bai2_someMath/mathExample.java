package bai2_someMath;

import java.util.Scanner;

public class mathExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/// CÁC METHODS SỐ PI VÀ E
//        System.out.println(Math.PI);  in ra số PI !!!
//        System.out.println(Math.E);  in ra số E !!!


/// CÁC METHODS CƠ BẢN TRONG Math
//        double result;
//        result = Math.pow(2, 3); tính số mũ
//        result = Math.abs(-6); tính giá trị tuyệt đối
//        result = Math.sqrt(27); tính căn bậc 2
//        result = Math.round(3.14); làm tròn số :v
//        result = Math.ceil(3.14); làm tròn lên
//        result = Math.floor(3.99); làm tròn xuống
//        result = Math.max(10, 20); tím số lớn nhất
//        result = Math.min(10, 20); tìm số nhỏ nhất
//        System.out.println(result);


/// CÁC PHÉP TOÁN CƠ BẢN
/// BÀI 1: TÍNH DIỆN TÍCH TAM GIÁC VUÔNG
//        double a;
//        double b;
//        double c;
//        a = scanner.nextDouble();
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
//
//        System.out.println(c);

/// BÀI 2: TÍNH CHU VI, DIỆN TÍCH VÀ THỂ TÍCH HÌNH TRÒN
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Hãy nhập bán kính: ");
        radius = scanner.nextDouble();

        circumference = 2 * radius * Math.PI;
        area = Math.pow(radius, 2) * Math.PI;
        volume = Math.pow(radius, 3) * Math.PI * (4.0/3.0);

        System.out.printf("Chu vi của hình tròn là: %.2f\n", circumference);
        System.out.printf("Diện tích của hình tròn là: %.2f\n", area);
        System.out.printf("Thể tích của hình tròn là: %.2f\n", volume);


        scanner.close();
    }
}
