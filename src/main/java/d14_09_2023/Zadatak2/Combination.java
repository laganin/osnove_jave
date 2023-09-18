package d14_09_2023.Zadatak2;

import java.util.ArrayList;
import java.util.Collections;

public class Combination {
    private String ID;
    private ArrayList<Integer> numbers;

    public Combination(String ID, int number1, int number2, int number3, int number4, int number5, int number6, int number7) {
        this.ID = ID;
        this.numbers = new ArrayList<>();
        this.numbers.add(number1);
        this.numbers.add(number2);
        this.numbers.add(number3);
        this.numbers.add(number4);
        this.numbers.add(number5);
        this.numbers.add(number6);
        this.numbers.add(number7);
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public boolean sameCombination(Combination x) {
        Collections.sort(this.numbers);
        Collections.sort(x.numbers);
        for (int i = 0; i < this.numbers.size(); i++) {
            if (this.numbers.get(i) != x.numbers.get(i))
                return false;
        }
        return true;
    }

    public void print() {
        System.out.println("ID: " + this.ID);
        System.out.print("brojevi: ");
        for (int i = 0; i < this.numbers.size(); i++) {
            if (this.numbers.size() - 1 == i) {
                System.out.print(this.numbers.get(i));
                System.out.println();
            } else System.out.print(this.numbers.get(i) + ", ");
        }
    }

}
