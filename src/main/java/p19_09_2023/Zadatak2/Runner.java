package p19_09_2023.Zadatak2;

import p19_09_2023.Zadatak2.Athlete;

public class Runner extends Athlete {

    public Runner(String fullName, double result) {
        super(fullName, result);
    }

    @Override
    public boolean betterResult(Athlete x) {
        return this.result < x.result;
    }

}
