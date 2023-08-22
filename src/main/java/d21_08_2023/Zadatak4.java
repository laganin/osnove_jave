package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//like
//smile
//heart
//
//	Primer izvrsenja:
//Unesite N: 7
//	Reaguj: like
//	Reaguj: heart
//	Reaguj: smile
//	Reaguj: lol
//	Reaguj: smile
//	Reaguj: like
//	Reaguj: like
//Summary: like 3 | smile 2 | heart 1
//
//Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int N = s.nextInt();
        String x = "like"; int brojx = 0;
        String y = "smile"; int brojy = 0;
        String z = "heart"; int brojz = 0;

        for (int i = 1; i <=N; i++) {
            System.out.print("Unesite tekst: ");
            String text = s.next();
            if (text.contains(x)) {
                brojx= brojx +1;
            }
            if (text.contains(y)) {
                brojy = brojy + 1;
            }
            if (text.contains(z)) {
                brojz = brojz + 1;
            }
        }
        System.out.println("Summary: " + x + " " + brojx + " | " + y + " " + brojy + " | " + z + " " + brojz);
    }
}
