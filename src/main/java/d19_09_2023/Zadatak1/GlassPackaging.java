package d19_09_2023.Zadatak1;

public class GlassPackaging extends Packaging {

    private double deposit;
    private boolean needDeposit;
    private double basicPrice;

    public GlassPackaging(String barcode, String article, double netWeight, double grossWeight, double deposit, boolean needDeposit, double basicPrice) {
        super(barcode, article, netWeight, grossWeight);
        this.deposit = deposit;
        this.needDeposit = needDeposit;
        this.basicPrice = basicPrice;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public boolean isNeedDeposit() {
        return needDeposit;
    }

    public void setNeedDeposit(boolean needDeposit) {
        this.needDeposit = needDeposit;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public double price() {
        if (this.needDeposit) {
            return this.basicPrice * 1.2 + this.deposit;
        } else {
            return this.basicPrice * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Barcode is " + this.barcode);
        System.out.println("Product name " + this.article);
        System.out.println("Net weight is " + this.netWeight);
        System.out.println("Gross wright is " + this.grossWeight);
        if (this.needDeposit) {
            System.out.println("It needs deposit which is " + this.deposit + ".");
        } else System.out.println("It does not need deposit");
        System.out.print("Cost is " + this.price());
        System.out.println();
    }
}
