package onClass.lab4.de1;

public class Product {
    private String code;
    private double price;
    private int quantity;

    public Product(){}
    public Product(String code, double price, int quantity){
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + "," + price + "," +quantity;
    }
}
