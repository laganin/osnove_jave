package d14_09_2023.Zadatak1;

public class Exam {

    private String subject;
    private int grade;
    private String profFullName;

    public Exam(String subject, int grade, String profFullName) {
        this.subject = subject;
        this.grade = grade;
        this.profFullName = profFullName;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    public String getProfFullName() {
        return profFullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setProfFullName(String profFullName) {
        this.profFullName = profFullName;
    }

    public void print() {
        System.out.println(this.subject + " - " + this.profFullName + " - " + this.grade);
    }

    public boolean examPassed() {
        return this.grade > 5;
    }
}
