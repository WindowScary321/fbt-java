package Basic.bai3_OOP.constructor;

public class main {
    public static void main (String[] args){
        Student2 student1 = new Student2("SonTUng", 30, 3.0);
        Student2 student2 = new Student2("Tungnui", 29, 3.3);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();
    }
}
