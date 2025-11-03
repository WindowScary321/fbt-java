package onClass.lab4.de2;

public class Dog extends Animal{
    private String breed;
    private boolean trained;

    public Dog(){}
    public Dog(String name, double weight, int age, String breed, boolean trained){
        super(name, weight, age);
        this.breed = breed;
        this.trained = trained;
    }

    @Override
    public String toString() {
        return getName() + ", " + getWeight() + ", " + getAge() + ", " + breed + ", " + trained;
    }

    public void setData() {
        if (trained == true) { // có thể viết gọn là if (trained)
            setWeight(getWeight() * 1.1);
        }

        if (getAge() > 5) {
            setWeight(getWeight() * 0.95);
        }
    }

    public double getValue() {
        double factor = trained ? 1.2 : 1.0;
        return getWeight() * getAge() * factor;
    }

}
