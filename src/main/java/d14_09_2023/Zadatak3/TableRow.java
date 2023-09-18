package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> cells;

    public TableRow() {
        this.cells = new ArrayList<>();
    }

    public void addCellRow(String one) {
        this.cells.add(one);
    }

    public void print() {
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print(this.cells.get(i) + "\\\\t\\\\t|");
        }
        System.out.println();
    }

    public void printHTML() {
        System.out.print("<tr>");
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print("<td>");
            System.out.print(this.cells.get(i));
            System.out.print("</td>");
        }
        System.out.print("</tr>");
        System.out.println();
    }

    public boolean doubleText(String x) {
        for (int i = 0; i < this.cells.size(); i++) {
            if (this.cells.get(i).contains(x)) {
                return true;
            }
        }
        return false;
    }
}

