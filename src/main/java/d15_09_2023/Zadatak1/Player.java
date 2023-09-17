package d15_09_2023.Zadatak1;

public class Player extends Person {
    private int number;
    private String position;
    private boolean captain;

    public Player() {
    }

    public Player(String fullName, String JMBG, int birthYear, int number, String position, boolean captain) {
        super(fullName, JMBG, birthYear);
        this.number = number;
        this.position = position;
        this.captain = captain;
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

    @Override
    public void print() {
        super.print();
        System.out.println(this.number + ", " + this.position);
        if (this.captain == true) {
            System.out.println("captain");
        }
    }
}
