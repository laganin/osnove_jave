package p18_09_2023.Zadatak1;

import p15_09_2023.Zadatak2.PaymentCard;

public class VisaCard extends PaymentCard {
    private String authorizedPerson;

    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    public VisaCard(int balance, String number, int expirationYear, int expirationMonth, String authorizedPerson) {
        super(balance, number, expirationYear, expirationMonth);
        this.authorizedPerson = authorizedPerson;
    }

    @Override
    public void transaction(double amount) {
        double commission = amount * 0.018;
        if (commission < 4) {
            commission = 4;
        }
        amount = amount + commission;
        super.transaction(amount);
        this.balance -= amount;
    }

    @Override
    public void print() {
        System.out.print("Visa Card: ");
        System.out.println(this.number + ", " + this.expirationMonth + "/" + this.expirationYear + ", $" + this.balance);
    }

}
