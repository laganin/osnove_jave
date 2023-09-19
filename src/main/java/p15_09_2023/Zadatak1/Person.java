package p15_09_2023.Zadatak1;

public class Person {

    protected String fullName;
    protected String JMBG;

    public Person(String fullName, String JMBG) {
        this.fullName = fullName;
        this.JMBG = JMBG;
    }

    public void print (){
        System.out.println(this.fullName + ", " + this.JMBG);
    }

    public String getFullName() {
        return fullName;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }
}
