package vezba;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3_1_1 {
    public static void main(String[] args) {
        ArrayList<Integer> odigranaKombinacija = new ArrayList<>();
        ArrayList<Integer> izvucenaKombinacija = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean dobitnaKombinacija = true;

        for (int i = 0; i < 7; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            odigranaKombinacija.add(broj);
        }

        for (int i = 0; i < 7; i++) {
            System.out.print("Unesite broj2: ");
            int broj2 = s.nextInt();
            izvucenaKombinacija.add(broj2);
        }

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
