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

//package BasicStuffs.bai3_oopStuffs;
//
//import java.util.Scanner;
//
//public class Utils {
//    Scanner scanner = new Scanner(System.in);
//    public int inputInt(String msg, int min, int max){
//        int num;
//        do{
//            System.out.println(msg);
//            try { // lặp liên tục, nếu lỗi nhảy vào "catch"
//                num=Integer.parseInt(scanner.nextLine()); // num = scanner.nextInt();
//                if (!(num>=min && num<=max)){
//                    System.out.println("Out of rage, vui lòng nhập lại.");
//                }else{
//                    break;
//                }
//                break; // user nhập đúng -> thoát khỏi vòng lặp
//            }catch (Exception e){
//                System.out.println("Sai kiểu dữu liệu!!! Vui lòng thử lại.");
//                scanner.nextLine();
//            }
//        }while (true); // lặp liên tục
//        return num;
//
//    }
//}
