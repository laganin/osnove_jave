package p18_09_2023.Zadatak2;

public class MasterStudent extends Student {

    public MasterStudent(String fullName, String indexNumber, int studyYear) {
        super(indexNumber, fullName, studyYear);
    }


    @Override
    public void scholarshipCost() {
        System.out.println(100000);
    }

    @Override
    public boolean budget() {
        return getStudyYear() < 2;
    }
}
