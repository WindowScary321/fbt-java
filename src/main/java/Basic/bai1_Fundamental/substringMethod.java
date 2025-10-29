package Basic.bai1_Fundamental;

import java.util.Scanner;

public class substringMethod {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
//        String email = "tungnui@gmail.com";
//
//        String username = email.substring(0, 7); // cắt String từ index 0 -> 7 (output: tungnui)
//        System.out.println(username);
//        String domain = email.substring(8, 13); // cắt String từ index 9 -> 13 (output: gmail)
//        System.out.println(domain);
        String email;
        String username;
        String domain;

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@")); // cắt từ 0 -> vị trí trc @
            domain = email.substring(email.indexOf("@") + 1); // cắt sau @
            System.out.println(username);
            System.out.println(domain);
        }else{
            System.out.println("Email ko hợp lệ.");
        }
    }
}
