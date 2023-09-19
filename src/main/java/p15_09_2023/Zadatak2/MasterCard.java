package p15_09_2023.Zadatak2;

public class MasterCard extends PaymentCard {


    public MasterCard(double balance, String number, int expirationYear, int expirationMonth) {
        super(balance, number, expirationYear, expirationMonth);
    }

    @Override
    public void transaction(double amount){
        double provizija = amount*0.015;
        amount = amount + provizija;
        super.transaction(amount);
    }

    public void maintenance (){
        super.balance -= 2;
    }

    @Override
    public void print (){
        System.out.print("Master Card: ");
        super.print();
    }
}
