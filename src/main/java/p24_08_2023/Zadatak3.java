package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.


        ArrayList<Integer> broj = new ArrayList<>();

        broj.add(2);
        broj.add(4);
        broj.add(5);
        broj.add(6);
        broj.add(7);

        int lastIndex = broj.size() - 1;
        int lastIndexNumber = broj.get(lastIndex);

        int firstIndexNumber = broj.get(0);

        broj.set(0, lastIndexNumber);
        broj.set(lastIndex, firstIndexNumber);

        System.out.println(broj);

    }
}
