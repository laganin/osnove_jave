package d15_09_2023.Zadatak2;

public class Person {
    protected String fullName;
    protected String JMBG;
    protected int birthYear;

    public Person() {
    }

    public Person(String fullName, String JMBG, int birthYear) {
        this.fullName = fullName;
        this.JMBG = JMBG;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void print() {
        System.out.println(this.fullName + ", " + this.JMBG + ", " + this.birthYear);
    }
}
