package onClass.lab4.de2;

public class Animal {
    private String name;
    private double weight;
    private int age;

    public Animal(){}
    public Animal(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ", " + weight + ", " + age;
    }
}
