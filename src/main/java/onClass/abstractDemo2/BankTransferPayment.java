package onClass.abstractDemo2;

public class BankTransferPayment extends PaymentMethod{
    private double fixedFee;
    private double amount;

    public BankTransferPayment(double fixedFee){
        this.fixedFee = fixedFee;
    }

    @Override
    void pay(double amount) {
        double total = amount + getFee(amount);
        System.out.println("Bạn đã thanh toán bằng Tài Khoảng Ngân Hàng, tổng số tiền:" +total);
    }

    @Override
    void refund(double amount) {
        System.out.println("Số tiền trả lại Tài Khoản Ngân Hàng là: "+ amount+ " đồng.");
    }

    @Override
    String getName() {
        return "Chuyển khoản Ngân hàng";
    }

    @Override
    double getFee(double amount) {
        return this.fixedFee;
    }
}
