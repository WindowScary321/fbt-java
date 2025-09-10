package bai1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //thêm dòng này và scanner.close() ở cuối để sử dụng scanner.
//VD0 :) (tính diện tích hình chữ nhật)
        double width;
        double height;
        double area;

        System.out.print("Chiều rộng: ");
        width = scanner.nextDouble();
        System.out.print("Chiều dài: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("Diện tích hình chữ nhật là: " + area);


//VD1
//        System.out.print("Hãy nhập tuổi: ");
//        int age = scanner.nextInt();
//        scanner.nextInt(); // Sau khi nhận giá trị int hoặc double, thêm dòng này để loại bỏ kí tự "\n" ở dòng trên.
//        System.out.print("Hãy nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.print("Hãy nhập mẫu xe yêu thích của bạn: ");
//        String carName = scanner.nextLine();
//
//        System.out.println("Bạn tên là: "+ name + ". Bạn "+ age + " tuổi.");
//        System.out.println("Mẫu xe yêu thích của bạn là: " + carName);

//VD2
//        System.out.print("Nhập tên của bạn: ");
//        String ten = scanner.nextLine();
//        System.out.print("Nhập tuổi của bạn: ");
//        int tuoi = scanner.nextInt();
//        System.out.print("Bạn có muốn tham gia ko? (true/false): ");
//        boolean thamgia = scanner.nextBoolean();
//
//        System.out.println("Xin chào " + ten + ". Bạn " + tuoi + " tuổi.");
//        if(thamgia){
//            System.out.print("Cảm ơn đã tham gia!");
//        }else{
//            System.out.print("Thật là buồn.");
//        }

        scanner.close();
    }
}
