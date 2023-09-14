package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private int ID;
    private String naziv;
    private ArrayList<TestStep> steps;

    public TestCase(int ID, String naziv) {
        this.ID = ID;
        this.naziv = naziv;
        this.steps = new ArrayList<>();
    }

    public void dodajStep(TestStep noviStep) {
        this.steps.add(noviStep);
    }

    private int failedSteps() {
        int amountOfFailed = 0;
        for (int i = 0; i < steps.size(); i++) {
            if (this.steps.get(i).validate() == false) {
                amountOfFailed = amountOfFailed + 1;
            }
        }
        return amountOfFailed;
    }

    private String stanje() {
        if (this.failedSteps() > 0) {
            return "FAILED";
        } else return "PASSED";
    }

    public void print() {
        System.out.println(this.ID + " - " + this.naziv);
        for (int i = 0; i < steps.size(); i++) {
            this.steps.get(i).print();
        }
        System.out.println("ukupan broj koraka " + this.steps.size() + " / broj test stepova koji su failovali " + this.failedSteps());
        System.out.print("Stanje test case-a ");
        System.out.println(this.stanje());
    }
}
