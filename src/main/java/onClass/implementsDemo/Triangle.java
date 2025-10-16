package onClass.implementsDemo;

public class Triangle implements Shape{
    private float a;
    private float b;
    private float c;
    private boolean isValid;

    public Triangle(){};
    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        if (a + b > c && a + c > b && b + c > a) {
            this.isValid = true;
        } else {
            this.isValid = false;
        }
    }

    @Override
    public float getPerimeter() {
        if (!isValid){
            return 0;
        }
        return a + b + c;
    }

    @Override
    public float getArea() {
        if (!isValid){
            return 0;
        }
        double s = getPerimeter() / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void display() {
        System.out.printf("Tam giác (Các cạnh: %.2f, %.2f, %.2f):%n", a, b, c);
        if (!isValid) {
            System.out.println("Lỗi input, ko thể tính dc.");
        } else {
            System.out.printf("Chu vi: %.2f%n", getPerimeter());
            System.out.printf("Diện tích: %.2f%n", getArea());
        }
    }
}
