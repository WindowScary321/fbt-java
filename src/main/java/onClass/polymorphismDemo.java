package onClass;

import java.util.Scanner;

public class polymorphismDemo {

    static void hello(){
        System.out.println("Hello1");
    }
    static void hello(String s){
        System.out.println("Hello2 "+s);
    }
    static void hello(char c){
        System.out.println("hello3 "+c);
    }
    static void hello(int n){
        System.out.println("hello4 "+n);
    }

    public static void main(String[] args){
        hello('a');
    }
}
