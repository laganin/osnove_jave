package vezba;


import java.util.ArrayList;

public class Zadatak3_1 {
    public static void main(String[] args) {

//Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//je odigrana loto kombinacija upravo izvucena kombinacija. Korisnik unosi dva niza oba duzine
//7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//Program na kraju ispisuje da li je izvucena kombinacija.Primer poziva metoda:
//Ako se unesu nizovi:
//● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
//● Program stampa “Nije izvucena kombinacija”
//Ako se metoda pozove za:
//● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
//● Program stampa “Jeste izvucena kombinacija”
//Napomena: Resenje preko petlje nosi maksimalni broj poena, dok resenje bez petlji nosi
//50% poena.

        ArrayList<Integer> odigranaKombinacija = new ArrayList<>();
        ArrayList<Integer> izvucenaKombinacija = new ArrayList<>();

        odigranaKombinacija.add(1);
        odigranaKombinacija.add(2);
        odigranaKombinacija.add(3);
        odigranaKombinacija.add(4);
        odigranaKombinacija.add(5);
        odigranaKombinacija.add(33);
        odigranaKombinacija.add(29);

        izvucenaKombinacija.add(1);
        izvucenaKombinacija.add(2);
        izvucenaKombinacija.add(3);
        izvucenaKombinacija.add(4);
        izvucenaKombinacija.add(5);
        izvucenaKombinacija.add(33);
        izvucenaKombinacija.add(29);


        if (izvucenaKombinacija.equals(odigranaKombinacija)){
            System.out.println("Jeste dobitna kombinacija");
        } else System.out.println("Nije dobitna kombinacija");
    }
}