package p19_09_2023.Zadatak1;

import java.util.ArrayList;

public class TaxOffice {

    private String city;
    private ArrayList<Building> buildings;

    public TaxOffice(String city) {
        this.city = city;
        this.buildings = new ArrayList<>();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public void addBuilding(Building x) {
        this.buildings.add(x);
    }

    public Building highestTax() {
        Building highest = this.buildings.get(0);
        for (int i = 0; i < this.buildings.size(); i++) {
            if (highest.tax() < this.buildings.get(i).tax())
                highest = this.buildings.get(i);
        }
        return highest;
    }

    public Building lowestTax() {
        Building lowest = this.buildings.get(0);
        for (int i = 0; i < this.buildings.size(); i++) {
            if (lowest.tax() > this.buildings.get(i).tax())
                lowest = this.buildings.get(i);
        }
        return lowest;
    }

    public double totalTax() {
        double total = 0;
        for (int i = 0; i < this.buildings.size(); i++) {
            double single = this.buildings.get(i).tax();
            total = total + single;
        }
        return total;
    }

    public void print() {
        for (int i = 0; i < this.buildings.size(); i++) {
            this.buildings.get(i).print();
        }
    }
}
