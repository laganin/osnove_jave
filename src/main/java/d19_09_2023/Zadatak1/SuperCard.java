package d19_09_2023.Zadatak1;

public class SuperCard {

    private String number;
    private String holderFullName;
    private double discount;

    public SuperCard(String number, String holderFullName, double discount) {
        this.number = number;
        this.holderFullName = holderFullName;
        this.discount = discount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolderFullName() {
        return holderFullName;
    }

    public void setHolderFullName(String holderFullName) {
        this.holderFullName = holderFullName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void print() {
        System.out.println("Card number is " + this.number + ", cardholder name is " + this.holderFullName);
    }
}
