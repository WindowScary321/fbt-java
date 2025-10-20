package onClass.lab3;

public class main {
    public static void main (String[] args){
        Employee demoFulltime = new FullTimeEmployee(10000000, 2000000, "Trưởng phòng.");
        demoFulltime.display();

        System.out.println();
        Employee demoParttime = new PartTimeEmployee(500000, 0, "Phụ bếp.");
        demoParttime.display();

        System.out.println();
        Employee demoIntern = new intern(400000, "Sinh viên.");
        demoIntern.display();
    }
}
