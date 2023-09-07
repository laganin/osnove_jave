package vezba;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
//ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi
//da unese kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje
//sumu za trazenu kolonu.
//Primer izvrsenja:
//3,1,8,0,1,
//1,5,7,9,6,
//3,1,6,5,1,
//4,5,8,1,7,
//1,3,2,8,0,
//Unesite kolonu za sumiranje: 2
//Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

        ArrayList<Integer> tabela = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        tabela.add(3);
        tabela.add(1);
        tabela.add(8);
        tabela.add(0);
        tabela.add(1);
        tabela.add(1);
        tabela.add(5);
        tabela.add(7);
        tabela.add(9);
        tabela.add(6);
        tabela.add(3);
        tabela.add(1);
        tabela.add(6);
        tabela.add(5);
        tabela.add(1);
        tabela.add(4);
        tabela.add(5);
        tabela.add(8);
        tabela.add(1);
        tabela.add(7);
        tabela.add(1);
        tabela.add(3);
        tabela.add(2);
        tabela.add(8);
        tabela.add(0);

        int x = 5;
        int table = x * x;
        int suma = 0;

        System.out.print("Unesite kolonu za sumiranje: ");
        int kolona = s.nextInt();
        for (int i = 0; i < table; i++) {
            if (i % x == kolona) {
                int broj = tabela.get(i);
                suma = suma + broj;
            }
        }
        System.out.print("Suma je " + suma);
    }
}