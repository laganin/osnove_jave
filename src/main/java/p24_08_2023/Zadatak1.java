package p24_08_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add(11);
        broj.add(12);
        broj.add(13);
        broj.add(14);
        broj.add(15);

        int lastIndex = broj.size() - 1;
        int suma = broj.get(0) + broj.get(lastIndex);

        System.out.println(suma);


    }
}
