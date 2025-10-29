package Basic.bai1_Fundamental;

public class stringMethod {
    public static void main (String[] args){
        String name = "Tung nui";

        int length = name.length(); // in ra chiều dài của chuỗi
        char letter = name.charAt(3); // in ra giá trị char dc chỉ định
        int index = name.indexOf("g"); // in ra giá trị int dc chỉ định
        int lastIndex = name.lastIndexOf("g"); // giống cái trên t đoán :v

        String name1 = name.toUpperCase(); // viết hoa :v
        String name2 = name.toLowerCase(); // Viết thường :v
        String name3 = "         dit me fbt          ";
//        String name31 = name.trim(); // xoá khoảng trắng
//
//        System.out.println(length);
//        System.out.println(letter);
//        System.out.println(index);
//        System.out.println(lastIndex);
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name31);

//        System.out.println(name.replace("u", "i")); // tên nói nên r :v
//        System.out.println(name.isEmpty()); // có trống ko ???

        if (name.contains(" ")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
