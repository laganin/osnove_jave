package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList <Sastojak> sastojci = new ArrayList<>();

        System.out.print("Unesite kolicinu sastojaka: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite naziv sastojka: ");
            String naziv = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();
            Sastojak sastojak  = new Sastojak(naziv, cena);
            sastojci.add(sastojak);
        }

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + " " + sastojci.get(i).getCena());
        }
    }
}
