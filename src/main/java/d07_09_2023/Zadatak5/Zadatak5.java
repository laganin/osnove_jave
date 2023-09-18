package d07_09_2023.Zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {

//Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
//Ispisati informacije o opremi.


        Equipment basketball = new Equipment();
        Equipment tennis = new Equipment();
        Equipment volleyball = new Equipment();

        basketball.make = "Molten";
        basketball.type = "ball";
        basketball.price = 999.99;

        tennis.make = "Head";
        tennis.type = "racquet";
        tennis.price = 3499.99;

        volleyball.make = "Mikasa";
        volleyball.type = "ball";
        volleyball.price = 599.89;

        System.out.println(tennis.price + ", " + tennis.type + ", " + tennis.make);
        System.out.println(basketball.price + ", " + basketball.type + ", " + basketball.make);
        System.out.println(volleyball.price + ", " + volleyball.type + ", " + volleyball.make);
    }
}
