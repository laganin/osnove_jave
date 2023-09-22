package d19_09_2023.Zadatak2;

import java.util.ArrayList;

public class MountainHouse {

    private String name;
    private int foundingYear;
    private ArrayList<Hiker> hikers;

    public MountainHouse(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.hikers = new ArrayList<>();
    }

    public MountainHouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public ArrayList<Hiker> getHikers() {
        return hikers;
    }

    public void setHikers(ArrayList<Hiker> hikers) {
        this.hikers = hikers;
    }

    public void addHiker(Hiker x) {
        this.hikers.add(x);
    }

    public int numberOfSuccessfulClimbers(Mountain x) {
        int total = 0;
        for (int i = 0; i < this.hikers.size(); i++) {
            if (this.hikers.get(i).successfulClimb(x)) {
                total++;
            }
        }
        return total;
    }

    public void kickOut(int x) {
        for (int i = 0; i < this.hikers.size(); i++) {
            if (x == this.hikers.get(i).ID) {
                this.hikers.remove(i);
            }
        }
    }

    public void print() {
        System.out.println("Mountain House " + this.name);
        System.out.println("Founded " + this.foundingYear);
        for (int i = 0; i < this.hikers.size(); i++) {
            this.hikers.get(i).print();
            System.out.println();
        }
    }

    public int income() {
        int total = 0;
        for (int i = 0; i < this.hikers.size(); i++) {
            total += this.hikers.get(i).membershipCost();
        }
        return total;
    }
}
