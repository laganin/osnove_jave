package p18_09_2023.Zadatak1;

public abstract class PaymentCard {

    protected double balance;
    protected String number;
    protected int expirationYear;
    protected int expirationMonth;

    public PaymentCard(double balance, String number, int expirationYear, int expirationMonth) {
        this.balance = balance;
        this.number = number;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void addAmount(double amount) {
        this.balance += amount;
    }

    public abstract void transaction(double amount);
//    {
//        this.balance -=  amount;
//    }

    public abstract void print();
//    {
//        System.out.println(this.number + ", " + this.expirationMonth + "/" + this.expirationYear + ", $" + this.balance);
//    }
}
