package BasicStuffs.bai1_fundamental;

public class printfStuffs {
    public static void main(String[] args) {

//        String name = "Strongbob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;


//        System.out.printf("Chào %s!. Bạn %d tuổi.", name, age);
//        System.out.printf("Hello %s", name); // %s = String
//        System.out.printf("Tên của bạn bắt đầu bằng: %c\n", firstLetter); // %c = char
//        System.out.printf("Bạn %d tuổi.\n", age);
//        System.out.printf("Bạn cao %f.\n", height);
//        System.out.printf("Chào %s!. Bạn %d tuổi.", name, age);

        double price1 = 9.99;
        double price2 = -100.15;
        double price3 = -54.212;
        int id1 = 1;
        int id2 = 69;
        int id3 = 2231;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%(.2f\n", price2); // thêm dấu "(" để tìm trị tuyệt đối
        System.out.printf("%+.3f\n", price3); // thêm dấu "+" để hiển thị dấu
        System.out.printf("\n");
        System.out.printf("%04d\n", id1); // thêm 3 số 0 trc số dc in
        System.out.printf("%04d\n", id2); // thêm 2 số 0 trc số dc in (số phía trc đã bị điền)
        System.out.printf("%04d\n", id3); // số dc in ra là 2231 (đã lấp đầy các số 0)
    }
}
