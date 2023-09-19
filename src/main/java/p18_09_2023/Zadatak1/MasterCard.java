package p18_09_2023.Zadatak1;

import p15_09_2023.Zadatak2.PaymentCard;

public class MasterCard extends PaymentCard {


    public MasterCard(double balance, String number, int expirationYear, int expirationMonth) {
        super(balance, number, expirationYear, expirationMonth);
    }

    @Override
    public void transaction(double amount) {
        double commission = amount * 0.015;
        amount = amount + commission;
        this.balance -= amount;
    }

    public void maintenance() {
        super.balance -= 2;
    }

    @Override
    public void print() {
        System.out.print("Master Card: ");
        System.out.println(this.number + ", " + this.expirationMonth + "/" + this.expirationYear + ", $" + this.balance);
    }
}
