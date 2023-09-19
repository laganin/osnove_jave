package p19_09_2023.Zadatak1;

public abstract class Building {

    protected String address; //street and number
    protected double area;
    protected int zone; // 1,2 or 3

    public Building(String address, double area, int zone) {
        this.address = address;
        this.area = area;
        this.zone = zone;
    }

    public double coefficient() {
        if (this.zone == 1) return 1.4;
        if (this.zone == 2) return 1.1;
        if (this.zone == 3) return 1.05;
        return 0;
    }

    public abstract double tax ();

    public abstract void print ();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
