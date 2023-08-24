package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.

        ArrayList<Integer> broj = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        broj.add(11);
        broj.add(12);
        broj.add(13);
        broj.add(14);
        broj.add(15);

        int lastIndex = broj.size() - 1;

        System.out.print("Unesite poziciju: ");
        int unos = s.nextInt();
        if (unos <= broj.size()) {
            int indexNumber = broj.get(unos);
            System.out.println("Na poziciji " + unos + " je " + indexNumber);
        } else
            System.out.println("Pokusaj ponovo.");

    }
}
