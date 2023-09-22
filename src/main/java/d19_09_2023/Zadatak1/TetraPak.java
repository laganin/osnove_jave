package d19_09_2023.Zadatak1;

public class TetraPak extends Packaging {

    private boolean recyclable;
    private double basicPrice;

    public TetraPak(String barcode, String article, double netWeight, double grossWeight, boolean recyclable, double basicPrice) {
        super(barcode, article, netWeight, grossWeight);
        this.recyclable = recyclable;
        this.basicPrice = basicPrice;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public double price() {
        if (this.recyclable) {
            return this.weight() * 1.5 + this.basicPrice;
        } else {
            return this.basicPrice;
        }
    }

    @Override
    public void print() {
        System.out.println("Barcode is " + this.barcode);
        System.out.println("Product name " + this.article);
        System.out.println("Net weight is " + this.netWeight);
        System.out.println("Gross wright is " + this.grossWeight);
        if (this.recyclable) {
            System.out.println("It can be recycled.");
        } else System.out.println("It cannot be recycled");
        System.out.print("Cost is " + this.price());
        System.out.println();
    }
}
