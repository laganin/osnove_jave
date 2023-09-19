package p15_09_2023.Zadatak1;

public class Student extends Person {

    private String indexNumber;
    private int scholarshipToBePaid;

    public Student(String fullName, String JMBG, String indexNumber, int scholarshipToBePaid) {
        super (fullName, JMBG);
        this.indexNumber = indexNumber;
        this.scholarshipToBePaid = scholarshipToBePaid;
    }

    public void payScholarship(int amount){
        this.scholarshipToBePaid = this.scholarshipToBePaid - amount;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(this.indexNumber);
        System.out.println(this.scholarshipToBePaid);
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public int getScholarshipToBePaid() {
        return scholarshipToBePaid;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setScholarshipToBePaid(int scholarshipToBePaid) {
        this.scholarshipToBePaid = scholarshipToBePaid;
    }
}
