package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Player extends Person {
    private int number;
    private String position;
    private boolean captain;
    private ArrayList<Card> cards;

    public Player() {
    }

    public Player(String fullName, String JMBG, int birthYear, int number, String position, boolean captain) {
        super(fullName, JMBG, birthYear);
        this.number = number;
        this.position = position;
        this.captain = captain;
        this.cards = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void addCard(Card newCard) {
        this.cards.add(newCard);
    }

    private int yellowCards() {
        int amount = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getType().equals("yellow")) {
                amount++;
            }
        }
        return amount;
    }

    private int redCards() {
        int amount = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getType().equals("red")) {
                return amount++;
            }
        }
        return amount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.number + ", " + this.position);
        if (this.captain == true) {
            System.out.println("captain");
        }
        if (redCards() > 1) {
            System.out.println(super.fullName + " has " + this.redCards() + "red cards.");
        } else if (redCards() == 1) {
            System.out.println(super.fullName + " has a red card.");
        } else if (redCards() == 0) {
            System.out.println(super.fullName + " has no red cards.");
        }


        if (this.yellowCards() > 1) {
            System.out.println(super.fullName + " has " + this.yellowCards() + " yellow cards.");
        } else if (this.yellowCards() == 1) {
            System.out.println(super.fullName + " has a yellow card.");
        } else if (this.yellowCards() == 0) {
            System.out.println(super.fullName + " has no yellow cards.");
        }
    }
}