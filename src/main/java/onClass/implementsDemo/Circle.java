package onClass.implementsDemo;

public class Circle implements Shape {
    private float radius;

    public Circle(){};
    public Circle(float r){
        this.radius = r;
    }

    @Override
    public float getPerimeter(){
        return (float) (2* Math.PI*this.radius);
    }

    @Override
    public float getArea(){
        return (float) (Math.PI* Math.pow(radius, 2));
    }

    @Override
    public void display(){
        System.out.printf("Circle (radius: %.2f)%n", radius);
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Perimeter: %.2f%n", getPerimeter());
    }

}
