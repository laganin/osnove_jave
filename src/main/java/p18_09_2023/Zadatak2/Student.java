package p18_09_2023.Zadatak2;

public abstract class Student {

    protected String fullName;
    protected String indexNumber;
    protected int studyYear;

    public Student(String fullName, String indexNumber, int studyYear) {
        this.indexNumber = indexNumber;
        this.fullName = fullName;
        this.studyYear = studyYear;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public abstract void scholarshipCost();

    public abstract boolean budget();

    public void print() {
        System.out.println(this.fullName + ", " + this.indexNumber + ", " + this.studyYear);
        System.out.print("Budget: ");
        if (this.budget()) System.out.println("student is not paying tuition");
        else System.out.println("student is paying tuition");
        System.out.print("Scholarship cost: ");
        this.scholarshipCost();
        System.out.println();
    }

}
