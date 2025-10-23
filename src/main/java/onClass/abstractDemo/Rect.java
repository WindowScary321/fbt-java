package onClass.abstractDemo;

public class Rect extends Shape{
    double l, w;
    public Rect (double l1, double w1){
        l = l1;
        w = w1;
    }

    public double circumstance() {
        return 2 * (l+w);
    }

    public double area() {
        return l*w;
    }
}
