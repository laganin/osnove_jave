package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//Izvrsenje:
//            2 na stepen 7 je 128
//
//Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2

        int broj = 2;
        int stepen = 7;
        int prod = 1;

        for (int i = 1; i <=stepen ; i++) {
            prod = prod * broj;
            }
        System.out.println("Stepen je " + prod);
        }


    }
