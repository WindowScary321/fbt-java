package onClass.abstractDemo2;

public class main {
    public static void main (String[] args){
        /// DEMO THANH TOÁN BẰNG THẺ.
        PaymentMethod theVisa = new CreditCardPayment(0.1);
        double giaTienThe = 10;
        System.out.println("Giá gốc: "+ giaTienThe);
        System.out.printf("Thanh toán bằng %s nhé!\n", theVisa.getName());
        theVisa.pay(giaTienThe);
        theVisa.refund(giaTienThe);

        System.out.println();
        /// DEMO THANH TOÁN BẰNG MOMO.
        PaymentMethod viMomo = new MomoPayment(0.15);
        double giaTienMomo = 10000;
        System.out.println("Giá gốc: "+ giaTienMomo);
        System.out.printf("Thanh toán bằng %s nhé!\n", viMomo.getName());
        viMomo.pay(giaTienMomo);
        viMomo.refund(giaTienMomo);

        System.out.println();
        /// DEMO THÀNH TOÁN BẰNG THẺ
        PaymentMethod tkNganHang = new BankTransferPayment(0.1);
        double giaTienNH = 200000;
        System.out.println("Giá gốc: "+ giaTienNH);
        System.out.printf("Thanh toán bằng %s nhé!\n", tkNganHang.getName());
        tkNganHang.pay(giaTienNH);
        tkNganHang.refund(giaTienNH);

    }
}
