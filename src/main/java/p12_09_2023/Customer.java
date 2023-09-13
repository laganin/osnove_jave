package p12_09_2023;

public class Customer {

    private String fullName;
    private MemberCard card;

    public Customer(MemberCard card) {
        this.card = card;
    }

    public void print() {
        System.out.println("Customer: " + this.fullName + " - Card number: " + this.card.getCardNumber());
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public MemberCard getCard() {
        return this.card;
    }

    public void setCard(MemberCard card) {
        this.card = card;
    }
}
