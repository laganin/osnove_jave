package d25_08_2023;

import java.util.Scanner;

public class Zadatak1_1 {
    public static void main(String[] args) {

        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(12);
    }

    public static void stampajVrednostZa10Vecu(int vrednost) {
        vrednost = vrednost + 10;
        System.out.print(vrednost);


    }
}
