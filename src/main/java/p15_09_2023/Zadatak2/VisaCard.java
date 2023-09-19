package p15_09_2023.Zadatak2;

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
        super (balance,number, expirationYear, expirationMonth);
        this.authorizedPerson = authorizedPerson;
    }

    @Override
    public void transaction (double amount){
        double provizija = amount*0.018;
        if (provizija<4){
            provizija=4;
        }
        amount = amount + provizija;
        super.transaction(amount);
    }

    @Override
    public void print (){
        System.out.print("Visa Card: ");
        super.print();
    }

}
