package BasicStuffs.bai3_oopStuffs;
import java.util.Scanner;

public class utilsTest {
    public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();

        int age = utils.inputInt("Hãy nhập tuổi của bạn",1, 100);
        System.out.printf("Tuổi của bạn là: %d\n", age);


    }
    }
