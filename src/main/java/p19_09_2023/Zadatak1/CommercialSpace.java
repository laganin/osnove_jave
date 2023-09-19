package p19_09_2023.Zadatak1;

public class CommercialSpace extends Building {

    public CommercialSpace(String address, double area, int zone) {
        super(address, area, zone);
    }

    @Override
    public double tax() {
        return this.coefficient() * this.area * 1.3;
    }

    @Override
    public void print() {
        System.out.println("Address is " + this.address);
        System.out.println("Area is " + this.area);
        System.out.println("Zone is " + this.zone);
        System.out.println("Tax is " + this.tax());
        System.out.println();
    }
}
