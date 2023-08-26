package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(1);
        niz.add(2);
        niz.add(4);
        niz.add(5);
        niz.add(7);

        int lastOfIndex = niz.size()-1;

        for (int i = lastOfIndex; i > -1; i--) {
            int broj = niz.get(i);
            System.out.print(broj + ", ");

        }


    }
}
