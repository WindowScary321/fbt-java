package BasicStuffs.bai3_oopStuffs;

public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student("StrongBob", 18, 3.2);
        Student student2 = new Student("Patty", 19, 1.5);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();

    }
}
