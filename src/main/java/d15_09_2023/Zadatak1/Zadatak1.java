package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Player one = new Player("Milan Jovanovic", "0123654789", 1991, 22, "center", false);
        Player two = new Player("Vladimir Minic", "9876541230", 1994, 55, "play", true);

        Coach a = new Coach("Jovan Memedovic", "03214569787", 1950, 35, "Personal");
        Coach b = new Coach("Ana Laganin", "032144156987", 1989, 7, "Strategy");

//        a.print();
//        System.out.println();
//        b.print();
//        System.out.println();
//        one.print();
//        System.out.println();
//        System.out.println();
//        two.print();
//        System.out.println();

        ArrayList<Player> players = new ArrayList<>();

        ArrayList<Coach> coaches = new ArrayList<>();

        System.out.print("How many players does your team have? ");
        int team = s.nextInt();

        for (int i = 0; i < team; i++) {
            System.out.print("Player first name: ");
            String name = s.next();

            System.out.print("Player last name: ");
            String lastame = s.next();

            String fullName = name + " " + lastame;

            System.out.print("Player JMBG: ");
            String JMBG = s.next();

            System.out.print("Player birth year: ");
            int year = s.nextInt();

            System.out.print("Player jersey number: ");
            int number = s.nextInt();

            System.out.print("Player position: ");
            String position = s.next();

            System.out.print("Is player the captain? true/false ");
            boolean captain = s.nextBoolean();

            players.add(new Player(fullName, JMBG, year, number, position, captain));

        }

        for (int i = 0; i < team; i++) {
            System.out.println();
            players.get(i).print();
            System.out.println();
        }

        System.out.print("How many coaches does your team have? ");
        int numberOfCoaches = s.nextInt();

        for (int i = 0; i < numberOfCoaches; i++) {
            System.out.print("Coach first name: ");
            String name = s.next();

            System.out.print("Coach last name: ");
            String lastame = s.next();

            String fullName = name + " " + lastame;

            System.out.print("Coach JMBG: ");
            String JMBG = s.next();

            System.out.print("Coach year of birth: ");
            int birth = s.nextInt();

            System.out.print("Coaching experience in years: ");
            int year = s.nextInt();

            System.out.print("Staffing position: ");
            String position = s.next();

            coaches.add(new Coach(fullName, JMBG, birth, year, position));

        }

        for (int i = 0; i < numberOfCoaches; i++) {
            System.out.println();
            coaches.get(i).print();
            System.out.println();
        }

    }
}
