package d14_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        Student a = new Student("IT1", "Milan Jovanovic", "IT");
        Student b = new Student("HP1", "Vladimir Minic", "Hospitality");

        Exam one = new Exam("Life", 5, "Jovana Jovanovic");
        Exam two = new Exam("Hotels", 10, "Milica Radovanovic");
        Exam three = new Exam("Management", 6, "Lazar Lazarevic");
        Exam four = new Exam("Management", 8, "Dijana Cejic");


        a.addExam(one);
        a.addExam(three);
        a.averageGrade();
        a.print();
        System.out.println();
        b.addExam(two);
        b.addExam(four);
        b.averageGrade();
        b.print();
    }
}
