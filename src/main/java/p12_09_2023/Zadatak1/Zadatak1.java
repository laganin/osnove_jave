package p12_09_2023.Zadatak1;

public class Zadatak1 {

//Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
//
//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//popust (u rasponu od 5 do 10 %)
//broj kartice (npr: 9329-0239)
//gettere i setter
//konstuktore

// U glavnom programu kreirati objekte i isprobati funkcionalnosti.

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
