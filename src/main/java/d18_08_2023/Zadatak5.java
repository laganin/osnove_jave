package d18_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {

//Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//sve parne stampa kao negativne
//sve neprane kao pozitivne brojeve
//                Primer izvrssenja:
//	   0, 1, -2, 3, -4, 5, -6, ……..
//

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");}
                else if (i % 2 == 0) {
                    System.out.print("-" + i + ", ");
                }

            }
        }
    }