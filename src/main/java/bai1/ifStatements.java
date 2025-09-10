package bai1;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập tuổi: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Bạn đã đủ tuổi.");
        }else if(age<0){
            System.out.println("Bạn chưa dc sin ra ư ?");
        }else if(age == 0){
            System.out.println("Bạn vừa mới được sinh ra!");
        }else{
            System.out.println("Bạn vẫn chưa đủ tuổi :(");
        }

        scanner.close();
        }
    }
