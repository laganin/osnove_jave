package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {

//Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva. 
//Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//primer jedne zamene:
//Ako je niz
//1,2,3,4,5,6,7,8,9,10
//i prvi random indeks je 4 a drugi random indeks je 6
//1,2,3,4,7,6,5,8,9,10  

        ArrayList<Integer> broj = new ArrayList<>();
        Random random = new Random();
        Random random2 = new Random();

        broj.add(1);
        broj.add(2);
        broj.add(3);
        broj.add(4);
        broj.add(5);
        broj.add(6);
        broj.add(7);
        broj.add(8);
        broj.add(9);
        broj.add(10);

        int bound = broj.size() - 1;


        for (int i = 1; i < 9; i++) {
            int pozicijax = random.nextInt(bound);
            int NumberX = broj.get(pozicijax);
            int pozicijay = random2.nextInt(bound);
            int Numbery = broj.get(pozicijay);
            broj.set(pozicijax, Numbery);
            broj.set(pozicijay, NumberX);
        }

        for (int j = 0; j < broj.size(); j++) {
            int niz = broj.get(j);
            System.out.print(niz + ", ");
        }


    }
}
        

