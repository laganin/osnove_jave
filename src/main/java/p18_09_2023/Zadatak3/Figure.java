package p18_09_2023.Zadatak3;

public abstract class Figure {

    public abstract double area ();
    public abstract double perimeter();

    public void print (){
        System.out.println("Figure area is " + this.area());
        System.out.println("Figure perimeter is " + this.perimeter());
        System.out.println();
    }

}
