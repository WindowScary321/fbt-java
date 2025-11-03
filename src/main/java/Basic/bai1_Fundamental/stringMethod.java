package Basic.bai1_Fundamental;

import java.util.Arrays;

public class stringMethod {
    public static void main (String[] args){
        String name = "Em Yeu dai hoc fbt!";

        System.out.println(name.length()); // in ra chiều dài của chuỗi
        System.out.println(name.charAt(0)); // in ra chữ cái ở index đó
        System.out.println("a".compareTo("C")); // so sánh (output âm vì "a" dc trc "c")
        System.out.println("c".compareTo("a")); // số dương
        System.out.println("a".compareTo("a")); // bằng 0

        /// SO SÁNH (trả về true/false)
        System.out.println();
        System.out.println("java".equals("JAVA")); // so sánh 2 chuỗi (phân biệt chữ hoa)
        System.out.println("java".equalsIgnoreCase("JAVA")); // so sánh 2 chuỗi (ko phân biệt chữ hoa)
        System.out.println("javascript".isEmpty()); // có hay ko ?
        System.out.println("Minecraft".startsWith("M")); // chuỗi có bắt đầu bằng 1 chuỗi con (prefix) ko ?
        System.out.println("microsoft.com".endsWith("m")); // chuỗi có bắt đầu bằng 1 chuỗi con (subfix) ko ?
        System.out.println("banana".indexOf("an")); // Tìm và trả về vị trí (index) xuất hiện đầu tiên của chuỗi con. Nếu không thấy, nó trả về -1.
        System.out.println("banana".lastIndexOf("an")); // giống dòng trên những tìm vị trí xuất hiện cuối cùng

        /// THAY ĐỔI CHUỖI INPUT
        System.out.println();
        System.out.println(name.toUpperCase()); // viết hoa input :v
        System.out.println(name.toLowerCase()); // viết thường input :v
        System.out.println("   mai yeu dai hoc fbt  ".trim()); // xoá khoảng trắng ở đầu và cuối
        System.out.println("Hello World, Hello Java".replace("Hello", "hi")); // sửa chuỗi
        System.out.println("123-456-7890".replaceAll("\\d", "X")); // giống trên, thêm regex

        /// ARRAY (ko bt dùng)
        System.out.println();
        System.out.println(Arrays.toString("a,b,c".split(","))); // tách chuỗi thành array
        System.out.println("Hello World".substring(0, 5)); // trích xuất chuối (từ 0 -> 5)z
    }
}
