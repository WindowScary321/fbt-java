package onClass.abstractDemo;

public class Circle extends Shape{
    double r;
    public Circle (double r1){
        r = r1;
    }

    public double circumstance() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
