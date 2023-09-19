package p15_09_2023.Zadatak1;

public class Professor extends Person {

    private String subject;
    private double salary;

    public Professor(String fullName, String JMBG, String subject, double salary) {
        super (fullName, JMBG);
        this.subject = subject;
        this.salary = salary;
    }

    public void salaryRaise(double percent){
        this.salary = this.salary + this.salary * percent/100;
    }

    public void print(){
        super.print();
        System.out.println(this.subject);
        System.out.println(this.salary);
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
