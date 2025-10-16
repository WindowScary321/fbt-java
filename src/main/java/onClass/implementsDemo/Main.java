package onClass.implementsDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input Radius: ");
        float inputRadius = scanner.nextFloat();
        Shape hinhtron = new Circle(inputRadius);
        hinhtron.display();

        System.out.println("");
        System.out.printf("Input Width: ");
        float inputWidth = scanner.nextFloat();
        System.out.printf("Input Length: ");
        float inputLength = scanner.nextFloat();
        Shape hinhchunhat = new Rectangle(inputWidth, inputLength);
        hinhchunhat.display();

        System.out.println("");
        System.out.printf("Input 3 shapes (eg: 3 4 5): ");
        float inputSideA = scanner.nextFloat();
        float inputSideB = scanner.nextFloat();
        float inputSideC = scanner.nextFloat();
        Shape hinhtamgiac = new Triangle(inputSideA, inputSideB, inputSideC);
        hinhtamgiac.display();

//        Shape hinhtron = new Circle(5.0f);
//        Shape hinhchunhat = new Rectangle(10.0f, 15.0f);
//
//        hinhtron.display();
//        System.out.println("");
//        hinhchunhat.display();
        scanner.close();
    }
}
