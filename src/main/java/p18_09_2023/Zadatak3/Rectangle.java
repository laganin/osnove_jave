package p18_09_2023.Zadatak3;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return 2 * (this.a + this.b);
    }
}
