package BasicStuffs.bai3_oopStuffs.easyStuffs;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getGpa(){
        return this.gpa;
    }
    public boolean isEnrolled(){
        return this.isEnrolled;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setAge(int age) {
        this.age = age;
    }

    void study(){
        System.out.println(this.name + "is studying!");
    }
}
