package Basic.bai2_Math;

public class ifNested {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 10;
        String discountMessage = "";

        if (isStudent) {
            if (isSenior) {
                price *= 0.7;
                discountMessage = "Bạn là học sinh và người cao tuổi, được giảm giá 30%";
            } else {
                price *= 0.9;
                discountMessage = "Bạn là học sinh, được giảm giá 10%";
            }
        } else {
            if (isSenior) {
                price *= 0.8;
                discountMessage = "Bạn là người cao tuổi, được giảm giá 20%";
            } else {
                discountMessage = "Giá vé gốc là";
            }
        }

        System.out.printf("%s: %.2f", discountMessage, price);
    }
}