package p14_09_2023;

import java.util.ArrayList;

public class Pasta {

    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void dodajSastojak(Sastojak noviSastojak) {
        this.sastojci.add(noviSastojak);
    }

    public void obrisiSastojak(String imeSastojka) {
        for (int i = 0; i < sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(imeSastojka))
                this.sastojci.remove(i);
        }
    }

    public int cenaPaste() {
        int cenaPaste = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            int cenaSastojka = this.sastojci.get(i).getCena();
            cenaPaste = cenaPaste + cenaSastojka;
        }
        return cenaPaste;
    }

    public void print() {
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < sastojci.size(); i++) {
            this.sastojci.get(i).print();
        }
        System.out.println("Cena paste je " + this.cenaPaste() + ".din");

    }
}
