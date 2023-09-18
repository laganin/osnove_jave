package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class TableHeader {
    private ArrayList<String> cells;

    public TableHeader() {
        this.cells = new ArrayList<>();
    }

    public void addHeaderCell(String a1) {
        this.cells.add(a1);
    }

    public void print() {
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.println(this.cells.get(i) + "\\\\t\\\\t|");
        }
    }

    public void printHTML() {
        System.out.print("<tr>");
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print("<th>");
            System.out.print(this.cells.get(i));
            System.out.print("</th>");
        }
        System.out.print("</tr>");
    }
}
