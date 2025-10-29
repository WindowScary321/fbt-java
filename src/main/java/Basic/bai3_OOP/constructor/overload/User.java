package Basic.bai3_OOP.constructor.overload;

public class User {
    String username;
    String email;
    int age;

    public User(){
        this.username = "Khách";
        this.email = "ko có";
        this.age = 0;
    }

    public User(String username){
        this.username = username;
        this.email = "Chưa có email!"; // thuộc tính phụ
        this.age = 0; // thuộc tính phụ
    }
    public User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0; // thuộc tính phụ
    }
    public User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
