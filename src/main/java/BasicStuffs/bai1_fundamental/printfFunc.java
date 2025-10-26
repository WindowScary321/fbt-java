package BasicStuffs.bai1_fundamental;

public class printfFunc {
    public static void main (String[] args){
        String name = "tung nui";
        char firstLetter = 't';
        int age = 69;
        double heigh = 100.213;
        boolean isEmployed = true;

        double price1 = 9.9999;
        double price2 = 100.123;
        double price3 = -231.21;
        double price4 = 100000.32;

        int id1 = 1;
        int id2 = 32;
        int id3 = 699;

        /// Mấy thứ cơ bản [Flags]
        System.out.printf("Xin chào %s\n", name); // %s = String
        System.out.printf("Bắt đầu bằng: %c\n", firstLetter); // %c = char
        System.out.printf("M cao: %f\n", heigh); // %f = float (dùng dc cho double)
        System.out.printf("M %d tuổi\n", age); // %d = int
        System.out.printf("Đã có việc làm: %b\n", isEmployed); //  %b = boolean

        System.out.println();

        /// Thêm nhiều biến vào 1 dòng.
        System.out.printf("%s đang %d tuổi, cao %.2f.\n", name, age, heigh);

        System.out.println();

        /// Trường hợp đặc biệt [Precision] (rare)
        System.out.printf("%.2f\n", price1); // in ra 2 chữ số sau dấu phẩy
        System.out.printf("%.1f\n", price2); // in ra 1 chữ số sau dấu phẩy

        /// Trường hợp đặc biệt [Specifier character](legendary)
        System.out.printf("%+.3f\n", price1); // in ra dấu +,- trc số
        System.out.printf("%+.2f\n", price3); // giống trên nhưng đây là số âm (output: -231.21)
        System.out.printf("%,.2f\n", price4); // thêm dấu "," cho dễ đọc (output: 100,000.32)
        System.out.printf("%(.2f\n", price3); // làm tròn, thêm dấu ngoặc đơn (output: (231.21) )

        System.out.println();

        /// Trường hợp đặc biết [Width] (bố của 2 thg trên)
        System.out.printf("%04d\n", id1); // in ra thêm "4" kí tự có kèm 0 (output: "0001")
        System.out.printf("%4d\n", id2); // in ra thêm "4" kí tự ko kèm 0 vào bên trái (output: "  32")
        System.out.printf("%-4d\n", id3); // in ra thêm "4" kí tự ko kèm 0 vào bên phải (output: "699 ")



    }
}
