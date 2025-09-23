package BasicStuffs.bai1_fundamental;

import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double numDouble;
        boolean isHeads;
        // number = random.nextInt(); tạo số ngẫu nhiên từ - 2 tỉ -> 2 tỉ (giới hạn của int) :V
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        numDouble = random.nextDouble();
        isHeads = random.nextBoolean();

        if (isHeads){
            System.out.println("Măt ngửa!");
        }else{
            System.out.println("Mặt sấp!");
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(numDouble);


    }
}
