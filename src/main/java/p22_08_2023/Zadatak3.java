package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//Zadatak
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//Primer:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:2
//Unesite broj:3
//Unesite broj:0
//Unesite broj:5
//Unesite broj:3
//Unesite broj:4
//Kraj programa
//
//Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

        Scanner s = new Scanner(System.in);
        int broj = -1;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        boolean ottf = false;

        while (!ottf) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj==1) {
                one = one + 1;}

             else if (broj==2) {
                    two = two + 1;}

              else if (broj==3) {
                        three = three + 1;}

               else if (broj==4) {
                            four = four + 1;
            }
            if (one >= 1 && two >= 1 && three >=1 && four >=1) {
                ottf = true;
            }
        }
        System.out.println("KRAJ");
    }
}
