package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.

        Scanner s = new Scanner(System.in);
        boolean KRAJ = false;
        int I = 1;
        int V = 5;
        int X = 10;
        int L = V * 10;
        int C = I * 100;
        int D = V * 100;
        int M = I * 1000;

        while (!KRAJ) {
            System.out.print("Unesite rimski broj:");
            String broj = s.next();
            if (broj.equals("KRAJ")) {
                KRAJ = true;
                System.out.println("Kraj programa.");
            } else if (broj.equals("I")) {
                System.out.println("Arapski: " + I);
            }
                else if (broj.equals("V")) {
                System.out.println("Arapski: " + V);
            }
                else if (broj.equals("X")) {
                System.out.println("Arapski: " + X);
            }
                else if (broj.equals("L")) {
                System.out.println("Arapski: " + L);
            }
            else if (broj.equals("C")) {
                System.out.println("Arapski: " + C);
            }

            else if (broj.equals("D")) {
                System.out.println("Arapski: " + D);
            }
            else if (broj.equals("M")) {
                System.out.println("Arapski: " + M);
            }
        }
    }
}
