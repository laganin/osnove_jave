package d17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//Tea Tairovic je zatrazila od svojih najvernijih fanova ako mogu da joj izadju u susret i razviju softver za njene potrebe.
//Najveci fan Veljko se javio i iz razgovora je izvukao sta je potrebno da softver radi.
//Posto je izbacila 3 najveca hita, potrebno joj je da sracuna zaradu od pregleda na youtubu.
//Tea zaradjuje $1 na 1000 pregleda.
//Dok ne dodje do 50k pregleda, sve sto se zaradi sa youtube-a ostaje njoj.
// Ukoliko ima od 50k do 100k pregleda njen mendzer joj uzima fiksno $50, a sve preko 100k pregleda dele po pola.
//Program sa tastature ucitava ukupan broj pregleda jednog videa i ispisuje koliko ce Tea zaraditi od njega.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj pregleda za 'Bibi Habibi (Official Video | Album Balerina)': ");
        int views = s.nextInt();

        int zarada = views / 1000;

        if (views < 50000) {
            System.out.println("Tea zaradila si " + zarada + "$");
        }

        if (50000 >= views || views <= 100000) {
            int zarada50d = zarada - 50;
            System.out.println("Tea zaradila si " + zarada50d + "$");

        }

        if (views > 100000) {
            int zarada50p = zarada / 2;
            System.out.println("Tea zaradila si " + zarada50p + "$");


        }
    }}
