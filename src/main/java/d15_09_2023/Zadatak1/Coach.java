package d15_09_2023.Zadatak1;

public class Coach extends Person {

    private int yearsOfExperience;
    private String staffPosition;

    public Coach(String fullName, String JMBG, int birthYear, int yearsOfExperience, String staffPosition) {
        super(fullName, JMBG, birthYear);
        this.yearsOfExperience = yearsOfExperience;
        this.staffPosition = staffPosition;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.yearsOfExperience + ", " + this.staffPosition);
    }
}
