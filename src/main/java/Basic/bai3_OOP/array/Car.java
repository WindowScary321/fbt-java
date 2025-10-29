package Basic.bai3_OOP.array;

public class Car {
    String model;
    String color;

    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void drive(){
        System.out.println("Bạn đang lái xe " + this.model + ", màu " + this.color + ".");
    }
}
