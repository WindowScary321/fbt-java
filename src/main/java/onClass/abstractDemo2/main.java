package onClass.abstractDemo2;

public class main {
    public static void main (String[] args){
        PaymentMethod theVisa = new CreditCardPayment(0.1);
        System.out.println("Tôi muốn mua 1 ly kem với giá 10 đồng.");
        System.out.printf("Thanh toán bằng %s nhé!\n", theVisa.getName());
        double giaTien = 10;
        theVisa.pay(giaTien);
        System.out.println("Tôi ko muốn ăn ly kem này nữa, tôi muốn hoàn tiền!");
        theVisa.refund(giaTien);
        }
}
