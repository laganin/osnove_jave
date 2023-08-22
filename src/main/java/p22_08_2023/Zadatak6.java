package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//Ruzne reci koje program prepoznaje su:
//zajebava
//mars
//stoko
//svinjo
//Unesite rec: Jel
//Jel
//Unesite rec:ti
//ti
//Unesite rec:to
//to
//Unesite rec:mene
//mene
//Unesite rec:zajebavas
//beeeeeeeeeep
//Unesite rec:stoko
//beeeeeeeeeep
//Unesite rec:jedna.
//jedna.
//Kraj programa.

        Scanner s = new Scanner(System.in);
        boolean fail = false;
        String zajebava = "zajebava", mars = "mars", stoko = "stoko", svinjo = "svinjo";

        while (!fail) {
            System.out.print("Unesite rec:");
            String rec = s.next();
            if (rec.contains(zajebava) || rec.contains(mars) || rec.contains(stoko) || rec.contains(svinjo)) {
                System.out.println("beeeeeeeeeeeeep");
            } else System.out.println(rec);


            if (rec.contains(".")) {
                fail = true;
            }

        }
        System.out.println("Kraj programa");
    }
}
