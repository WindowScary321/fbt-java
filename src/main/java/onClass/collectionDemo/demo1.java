package onClass.collectionDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    private int id;
    private String name;
    private double gpa;

    public demo1 (int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public interface iStudent{

    }

    public static void main (String[] args){
        ArrayList<demo1> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = 10;
        while (count < max){
            System.out.println("Sinh viên thứ " + (count+1));
            System.out.println("Hãy nhập tên: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")){
                System.out.println("Phát hiện exit, thoát khỏi vòng lặp.");
                break;
            }
            System.out.println("Hãy nhập id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Hãy nhập gpa: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            demo1 sv = new demo1(id, name, gpa);
            studentList.add(sv);
            count++;
        }
        System.out.println("Đã nhập xong, tổng số sv trong danh sách: "+ studentList.size());

    }
//    public static ArrayList<demo1> findGreatest(ArrayList<demo1> studentList){
//
//    }
}

