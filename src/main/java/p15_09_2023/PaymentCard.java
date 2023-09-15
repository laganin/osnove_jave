package p15_09_2023;

public class PaymentCard {

    protected double balance;
    protected String number;
    protected int exirationYear;
    protected int exirationMonth;

    public PaymentCard(double balance, String number, int exirationYear, int exirationMonth) {
        this.balance = balance;
        this.number = number;
        this.exirationYear = exirationYear;
        this.exirationMonth = exirationMonth;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public int getExirationYear() {
        return exirationYear;
    }

    public int getExirationMonth() {
        return exirationMonth;
    }

    public void addAmount(double amount){
        this.balance += amount;
    }

    public void transaction (double amount){
        this.balance -=  amount;
    }

    public void print (){
        System.out.println(this.number + ", " + this.exirationMonth + "/" + this.exirationYear + ", $" + this.balance);
    }
}
