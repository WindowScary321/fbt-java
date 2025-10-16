package onClass.implementsDemo;

public class Rectangle implements Shape{
    private float width;
    private float length;

    public Rectangle(){};
    public Rectangle(float w, float l){
        this.width = w;
        this.length = l;
    }

    @Override
    public float getPerimeter(){
        return 2 * (this.width + this.length);
    }

    @Override
    public float getArea() {
        return this.width * this.length;
    }

    @Override
    public void display() {
        System.out.printf("Rectangle (Width: %.2f, Length: %.2f):%n", this.width, this.length);
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Perimeter: %.2f%n", getPerimeter());
    }
}
