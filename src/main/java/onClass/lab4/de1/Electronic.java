package onClass.lab4.de1;

public class Electronic extends Product{
    private String brand;
    private int warranty;

    public Electronic(){}
    public Electronic(String code, double price, int quantity, String brand, int warranty){
        super(code, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return getCode() + ", " + getPrice() + ", " + getQuantity() + ", " + brand + ", " + warranty;
    }

    public void setData() {
        if (brand.contains("Apple") || brand.contains("Samsung")){
            setPrice(getPrice()*1.15);
        }
        if (this.warranty < 12){
            setPrice(getPrice()*0.95);
        }
    }
    public double getValue(){
        return getPrice() * getQuantity() + warranty * 5;
    }
}
