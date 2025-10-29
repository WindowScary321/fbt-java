package Basic.bai3_OOP.array;

public class Main {
    public static void main (String[] args){
        Car[] cars = {new Car("Mercedes", "đỏ"),
                new Car("Mitsubishi", "xanh"),
                new Car("Ford", "đen")};

        for (Car car : cars){
            car.color = "vàng"; // sửa thuộc tính
        }

        for (Car car : cars){
            car.drive();
        }

//        Car car1 = new Car("Mercedes", "đỏ");
//        Car car2 = new Car("Mitsubishi", "xanh");
//        Car car3 = new Car("Ford", "đen");
//        Car[] cars = {car1, car2, car3};
//        for (int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }
///     2 vòng lặp giống hệt
//        for(Car car : cars){
//            car.drive();
//        }


    }
}
