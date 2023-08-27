package d25_08_2023;

import java.util.Scanner;

public class Zadatak4_1 {
    public static void main(String[] args) {

//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//         / / / / /
//        Napomena: Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int N = s.nextInt();
        System.out.print("Unesite karakter: ");
        char karakter = s.next().charAt(0);
        printCharacters(N, karakter);
    }

    public static void printCharacters(int N, char character) {
        for (int i = 0; i < N; i++) {
            System.out.print(character);
        }

    }
}
