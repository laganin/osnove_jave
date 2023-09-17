package d14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {

    private String index;
    private String FullName;
    private String studies;
    private ArrayList<Exam> exams;

    public Student(String index, String fullName, String studies) {
        this.index = index;
        FullName = fullName;
        this.studies = studies;
        this.exams = new ArrayList<>();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public void addExam(Exam newExam) {
        this.exams.add(newExam);
    }

    public double averageGrade() {
        int gradeSum = 0;
        int gradeAmount = 0;
        for (int i = 0; i < this.exams.size(); i++) {
            if (this.exams.get(i).examPassed()) {
                gradeSum += this.exams.get(i).getGrade();
                gradeAmount++;
            }
        }
        return gradeSum / gradeAmount;
    }

    public void print() {
        System.out.println(this.index + " - " + this.FullName + " - " + this.studies);
        System.out.println("Subjects:");
        for (int i = 0; i < this.exams.size(); i++) {
            this.exams.get(i).print();
        }
        System.out.println("Average grade: " + this.averageGrade());
    }
}


