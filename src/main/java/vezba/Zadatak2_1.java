package vezba;

import java.util.Scanner;

public class Zadatak2_1 {
    public static void main(String[] args) {

//Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//zaredom.Na kraju programa ispisati sumu unetih brojeva.
//Primer izvršenja 1:
//Unesite broj: 1
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 5
//Unesite broj: 9
//Unesite broj: 0
//Unesite broj: 0
//Suma je 19
//Primer izvrsenja 2:
//Unesite broj: 1
//Unesite broj: 1
//Unesite broj: 0
//Unesite broj: 1
//Unesite broj: 0
//Unesite broj: 9
//Unesite broj: 0
//Unesite broj: 0
//Suma je 12

        Scanner s = new Scanner(System.in);
        int suma = 0;
        int nule = 0;
        boolean dveNule = false;

        while (!dveNule) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
            if (broj == 0) {
                nule++;
            } else if (broj!=0){
                nule = 0;
            }
            if (nule == 2) {
                dveNule=true;
                System.out.println(suma);
            }
        }
    }
}
