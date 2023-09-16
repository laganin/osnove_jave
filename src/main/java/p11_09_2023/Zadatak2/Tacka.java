package p11_09_2023.Zadatak2;

public class Tacka {

    private int x;
    private int y;

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tacka() {
    }

    public void print() {
        System.out.println(this.x  + ", " + this.y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
