package vezba;

import java.util.ArrayList;

public class Zadatak3_2 {
    public static void main(String[] args) {

//Za potrebe loto igre na srecu, potrebno je implementirati metodu koja vraca informaciju da
//li je odigrana loto kombinacija upravo dobitna kombinacija. Metoda kao parametre prima dva
//niza oba duzine 7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu
//kombinaciju.Metoda kao povratnu vrednost vraca true ili false.
//U main programu pozvati metodu za vise kombinacija i ispisati odgovarajuce poruke.
//Primer poziva metoda:
//Ako se metoda pozove za:
//● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32} vraca false
//Ako se metoda pozove za:
//● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
//Napomena: Zadatak nije neophodno resiti koriscenjem petlje, ali bi bilo pozeljno

        ArrayList<Integer> odigranaKombinacija = new ArrayList<>();
        ArrayList<Integer> izvucenaKombinacija = new ArrayList<>();
        boolean dobitnaKombinacija = true;

        odigranaKombinacija.add(1);
        odigranaKombinacija.add(2);
        odigranaKombinacija.add(3);
        odigranaKombinacija.add(4);
        odigranaKombinacija.add(5);
        odigranaKombinacija.add(33);
        odigranaKombinacija.add(29);

        izvucenaKombinacija.add(11);
        izvucenaKombinacija.add(2);
        izvucenaKombinacija.add(3);
        izvucenaKombinacija.add(4);
        izvucenaKombinacija.add(5);
        izvucenaKombinacija.add(33);
        izvucenaKombinacija.add(29);

        for (int i = 0; i < 7; i++) {
            if (odigranaKombinacija.get(i) != izvucenaKombinacija.get(i)) {
                dobitnaKombinacija = false;
            }
        }

        if (dobitnaKombinacija) {
            System.out.println("Jeste");
        } else System.out.println("Nije");
    }
}
