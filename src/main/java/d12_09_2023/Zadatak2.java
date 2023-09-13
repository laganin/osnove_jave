package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> ispiti = new ArrayList<>();
        ZeleniKarton a = new ZeleniKarton("Aleksa Peric", 58, "Istorija", "Predrag Novakov", 5);
        ZeleniKarton b = new ZeleniKarton("Dragutin Topic", 49, "Priroda i drustvo", "Jovana Jovanovic", 9);
        ZeleniKarton c = new ZeleniKarton("Stefan Papic", 89, "Veterina", "Tamara Petrusic", 10);
        ZeleniKarton d = new ZeleniKarton("Milan Gurovic", 15, "Kosarka", "Aleksandar Nikolic", 7);
        ZeleniKarton e = new ZeleniKarton("Tanja Trkulja", 56, "Knjizevnost", "Maja Markovic", 10);

        ispiti.add(a);
        ispiti.add(b);
        ispiti.add(c);
        ispiti.add(d);
        ispiti.add(e);

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).print();
            System.out.println();
        }
        int sveOcene = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            int ocena = ispiti.get(i).getOcena();
            sveOcene = sveOcene + ocena;
        }

        double prosek = sveOcene / ispiti.size();
        System.out.println(prosek);

        int sviPolozeni = 0;
        int kolicinaPolozenih = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            int ocena = ispiti.get(i).getOcena();
            if (ocena > 5) {
                sviPolozeni = sviPolozeni + ocena;
            }
            if (ocena > 5) {
                kolicinaPolozenih = kolicinaPolozenih + 1;
            }
        }

        double prosekPolozenih = sviPolozeni / kolicinaPolozenih;
        System.out.println(prosekPolozenih);

    }
}
