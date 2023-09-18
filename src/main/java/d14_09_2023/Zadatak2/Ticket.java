package d14_09_2023.Zadatak2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Ticket {
    private ArrayList<Combination> combinations;

    public Ticket() {
        this.combinations = new ArrayList<>();
    }

    public void addCombination(Combination x) {
        if (this.combinations.size() < 7) {
            this.combinations.add(x);
        }
    }

    public boolean winningCombination(Combination x) {
        for (int i = 0; i < this.combinations.size(); i++) {
            if (this.combinations.get(i).sameCombination(x))
                return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < this.combinations.size(); i++) {
            this.combinations.get(i).print();
            System.out.println();
        }
    }
}
