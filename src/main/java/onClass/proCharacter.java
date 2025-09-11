package onClass;

import java.util.Scanner;

public class proCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Hôm nay trời đẹp quá và tôi có 300000000000đ trong ví.";

        int digits = 0;
        int kitu = 0;
        int spChar = 0;
        int upChar = 0;
        int lowChar = 0;

        for (int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                digits++;
            }if (Character.isAlphabetic(ch)){
                kitu++;
            }if (Character.isLowerCase(ch)){
                lowChar++;
            }if (Character.isUpperCase(ch)){
                upChar++;
            }else{
                spChar++;
            }
        }

        System.out.println("Tống số là: "+ digits);
        System.out.println("Tổng chữ là: "+ kitu);
        System.out.println("Tổng chứ in hoa: "+ lowChar);
        System.out.println("Tổng chữ thường: "+ upChar);
        System.out.println("Tổng số kí tự: "+ spChar);



//        Character.isDigit();
//        Character.isLetter();
//        Character.isLowerCase();
//        Character.isUpperCase();
//        Character.isAlphabetic();
    }
}
