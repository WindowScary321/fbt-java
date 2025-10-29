package Basic.bai3_OOP.easyStuffs;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Màu xe của bạn là: ");
        String carColour = scanner.nextLine();

        Car car1 = new Car();

        car1.setColour(carColour);
        car1.setEnginePower(500);
        car1.setConvertible(false);

        System.out.println("Thông tin xe của bạn: ");
        car1.pressStart();
        car1.pressAcceleratorButton();


//        Car car = new Car();
//        Car car1 = new Car();
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.isRunning);
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);
//        System.out.println(car.make + " "+ car1.model);
        scanner.close();
    }
}
