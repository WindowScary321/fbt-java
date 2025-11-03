package onClass.lab4.de2;

public class Main {
    public static void main (String[] args){
        Dog cho1 = new Dog("Tungnui", 12.5, 6, "Husky", true);
//        System.out.println(cho1.toString());
        cho1.setData();
        System.out.println(cho1.toString());
    }
}
