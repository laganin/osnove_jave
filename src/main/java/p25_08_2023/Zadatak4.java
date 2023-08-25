package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

// Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

        matematika(1, 2);
        matematika(2, 3);
        matematika(3, 4);

    }

    public static void matematika(int a, int b) {

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;

        System.out.println("Zbir je " + zbir);
        System.out.println("Razlika je " + razlika);
        System.out.println("Proizvod je " + proizvod);
        System.out.println("Kolicnik je " + kolicnik);

    }
}
