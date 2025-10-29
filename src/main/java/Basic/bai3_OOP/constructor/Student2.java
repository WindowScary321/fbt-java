package Basic.bai3_OOP.constructor;

public class Student2 {
    /// Kiểu dữu liệu cơ bản
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    /// Bắt đầu construct
    Student2(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }


    /// Method ngoài
    void study(){
        System.out.println(this.name + " đang học.");
    }
}
