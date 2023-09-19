package p19_09_2023.Zadatak2;

public class Jumper extends Athlete {

    public Jumper(String fullName, double result) {
        super(fullName, result);
    }

    @Override
    public boolean betterResult(Athlete x) {
        return this.result > x.result;
    }
}
