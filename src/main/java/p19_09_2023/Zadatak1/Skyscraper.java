package p19_09_2023.Zadatak1;

public class Skyscraper extends Building {

    private int suites;

    public Skyscraper(String address, double area, int zone, int suites) {
        super(address, area, zone);
        this.suites = suites;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    @Override
    public double tax() {
        return this.coefficient() * this.area * this.suites;
    }

    @Override
    public void print() {
        System.out.println("Address is " + this.address);
        System.out.println("Area is " + this.area);
        System.out.println("Zone is " + this.zone);
        System.out.println("Number of suits is " + this.suites);
        System.out.println("Tax is " + this.tax());
        System.out.println();
    }
}
