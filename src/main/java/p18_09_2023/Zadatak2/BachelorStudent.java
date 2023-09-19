package p18_09_2023.Zadatak2;

public class BachelorStudent extends Student {

    public BachelorStudent(String fullName, String indexNumber, int studyYear) {
        super(indexNumber, fullName, studyYear);
    }

    @Override
    public void scholarshipCost() {
        System.out.println(9000);
    }

    @Override
    public boolean budget() {
        return getStudyYear() < 5;
    }
}
