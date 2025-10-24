package onClass.abstractDemo2;

public class CreditCardPayment extends PaymentMethod{
    private double feeRate;
    private double amount;

    public CreditCardPayment(double feeRate){
        this.feeRate = feeRate;
    }

    @Override
    public double getFee(double amount) {
        return amount * this.feeRate;
    }

    @Override
    void pay(double amount) {
        double total = amount + getFee(amount);
        System.out.println("Bạn đã thanh toán bằng thẻ, tổng số tiền: "+ total);
    }
    @Override
    void refund(double amount) {
        System.out.println("Số tiền trả lại thẻ là: "+ amount+ " đồng.");
    }

    @Override
    String getName() {
        return "Thẻ tín dụng";
    }
}
