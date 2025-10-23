package onClass.abstractDemo;

public class main {
    public static void main (String[] args){
        Shape hinhTron = new Circle(10);
        System.out.printf("%.2f\n", hinhTron.circumstance());

        Shape hinhChuNhat = new Rect(25, 50);
        System.out.printf("%.2f\n", hinhChuNhat.area());
    }
}
