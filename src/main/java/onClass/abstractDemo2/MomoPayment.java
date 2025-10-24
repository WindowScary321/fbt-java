package onClass.abstractDemo2;

public class MomoPayment extends PaymentMethod{
    private double discountRate;
    private double amount;

    public MomoPayment(double discountRate){
        this.discountRate= discountRate;
    }

    @Override
    void pay(double amount) {
        double total = amount + getFee(amount);
        System.out.println("Bạn đã thanh toán bằng ví Momo, tổng số tiền: "+total);
    }

    @Override
    void refund(double amount) {
        System.out.println("Số tiền trả lại ví Momo là: "+ amount+ " đồng.");
    }

    @Override
    String getName() {
        return "Ví Momo";
    }

    @Override
    double getFee(double amount) {
        double baseFee = amount * 0.015; // Phí cố định 1.5%
        double discount = amount * this.discountRate; // Tiền được giảm
        return baseFee - discount;
    }
}
