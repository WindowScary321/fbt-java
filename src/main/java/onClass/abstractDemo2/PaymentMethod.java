package onClass.abstractDemo2;

abstract class PaymentMethod {
    abstract void pay(double amount);
    abstract void refund(double amount);
    abstract String getName();
    abstract double getFee(double amount);

}
