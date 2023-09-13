package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        MemberCard card = new MemberCard();
        Customer customer = new Customer(card);
        Product product = new Product(customer);

        card.setDiscount(10);
        card.setCardNumber("9329-0239");
        customer.setFullName("Milan Jovanovic");
        product.setName("Coca-Cola");
        product.setCostOfProduct(70);

        product.print();

    }
}
