package p19_09_2023.Zadatak1;

public class House extends Building {

    private int inhabitants;

    public House(String address, double area, int zone, int inhabitants) {
        super(address, area, zone);
        this.inhabitants = inhabitants;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    @Override
    public double tax() {
        return this.coefficient() * this.area;
    }

    @Override
    public void print() {
        System.out.println("Address is " + this.address);
        System.out.println("Area is " + this.area);
        System.out.println("Zone is " + this.zone);
        System.out.println("Number of inhabitants is " + this.inhabitants);
        System.out.println("Tax is " + this.tax());
        System.out.println();
    }
}
