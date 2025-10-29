package Basic.bai3_OOP.easyStuffs;

public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBreak;

    public Car(){
        colour = "";
        enginePower = 0;
        convertible = false;
        parkingBreak = false;
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBreak){
        this.colour= colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBreak = parkingBreak;
    }

    public void pressStart(){
        System.out.println("Bạn vừa bấm nút khởi động.");
    }

    public void pressAcceleratorButton(){
        System.out.println("You can press the accelerator button");
        System.out.println("Colour:"+ colour);
        System.out.println("Engine power:"+ enginePower);
        System.out.println("Convertible:"+ convertible);
        System.out.println("parking brake:"+ parkingBreak);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower)  {
        this.enginePower = enginePower;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

/// OLD OBJECTS
//    String make = "Ford";
//    String model = "Mustang";
//    int year = 2025;
//    double price = 5000.99;
//    boolean isRunning = false;
//
//
//    void start(){
//        isRunning = true;
//        System.out.println("You start the engine.");
//    }
//    void stop(){
//        isRunning = false;
//        System.out.println("You stop the engine.");
//    }
}

