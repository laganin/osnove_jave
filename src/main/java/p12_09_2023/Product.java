package p12_09_2023;

public class Product {
    private String name;
    private Customer customerInfo;
    private int costOfProduct;

    public Product(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }

    public double price() {
        return this.costOfProduct * 1.9 * (100 - this.customerInfo.getCard().getDiscount()) / 100;
    }

    public void print() {
        System.out.println("Product name: " + this.name + " - Price: " + this.price());
        this.customerInfo.print();
    }

    public int getCostOfProduct() {
        return this.costOfProduct;
    }

    public void setCostOfProduct(int costOfProduct) {
        this.costOfProduct = costOfProduct;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
