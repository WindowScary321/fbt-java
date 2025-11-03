package onClass.lab4.de1;

public class Main {
    public static void main (String[] args){
        Electronic e = new Electronic("E101", 800, 3, "Samsung", 10);
//        System.out.println(e.toString());
        e.setData();
        System.out.println(e.toString());
        System.out.printf("%.2f", e.getValue());
    }
}
