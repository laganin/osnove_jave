package p19_09_2023.Zadatak2;

public abstract class Athlete {

    private String fullName;
    protected double result;

    public Athlete(String fullName, double result) {
        this.fullName = fullName;
        this.result = result;
    }

    public String getFullName() {
        return fullName;
    }

    public double getResult() {
        return result;
    }

    public abstract boolean betterResult(Athlete x);

    public void print() {
        System.out.println(this.fullName + ", " + this.result);
    }
}
