package p18_09_2023.Zadatak3;

public class EquilateralTriangle extends Figure {

    private double a;

    public EquilateralTriangle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return (this.a * this.a) * 1.73205 / 4;
    }

    @Override
    public double perimeter() {
        return 3 * this.a;
    }
}
