package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);
        int one = 0;
        int two = 0;
        boolean brojke = false;

        while (!brojke) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 1) {
                one = one + 1;
            } else if (broj == 2) {
                two = two + 1;
            }
            if (one >= 3 || two >= 2) {
                brojke = true;
                System.out.println("Kraj programa.");
            }
        }

    }
}
