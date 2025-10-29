package Basic.bai3_OOP.constructor.overload;

public class main {
    public static void main (String[] args){
        User user1 = new User("son tung");
        User user2 = new User("son tung", "MTP@gmail.com");
        User user3 = new User("son tung", "MTP@gmail.com", 31);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
    }
}
