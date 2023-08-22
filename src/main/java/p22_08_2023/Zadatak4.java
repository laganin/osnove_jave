package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//Pojacaj - akcije koja povecava jacinu zvuka za 10
//smanji - akcija koja smajnjuje jacinu zvuka za 10.
//Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//Na kraju programa odstampati jacinu zvuka.
//
//Primer izvrsenja:
//Unesite akciju: pojacaj (iz 75 u 85)
//Unesite akciju: pojacaj ( iz 85 u 95)
//Unesite akciju: pojacaj (iz 95 u 100)
//Unesite akciju: smanji (iz 100 u 90)
//Unesite akciju: smanji (iz 90 u 80)
//Unesite akciju: play
//Jacina zvuka je 80.

        Scanner s = new Scanner(System.in);
        boolean fail = false;
        int jacinaZvuka = 75;
        int inkrement = 10;
        int maxJacinaZvuka = 100;
        int minJacinaZvuka = 0;
        String pojacaj = "pojacaj", smanji = "smanji", play = "play";

        while (!fail) {
            System.out.print("Unesite akciju:");
            String akcija = s.next();
            if (akcija.equals(pojacaj)) {
                jacinaZvuka = jacinaZvuka + inkrement;
                if (jacinaZvuka > maxJacinaZvuka) {
                    jacinaZvuka = maxJacinaZvuka;
                }
            }
            if (akcija.equals(smanji) && jacinaZvuka > minJacinaZvuka) {
                jacinaZvuka = jacinaZvuka - inkrement;
                if (jacinaZvuka < minJacinaZvuka) {
                    jacinaZvuka = minJacinaZvuka;
                }
            }

            if (akcija.equals("play")) {
                fail = true;
                System.out.println(jacinaZvuka);
            }

        }


    }
}
