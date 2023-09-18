package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class Table {
    private TableHeader header;
    private ArrayList<TableRow> rows;
    private int rowsPerPage = 5;

    public Table() {
        this.rows = new ArrayList<>();
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public void addRow(TableRow one) {
        this.rows.add(one);
    }

    public void print(int pageNumber) {
        int pageCount = 0;
        header.print();
        for (int i = 0; i < this.rows.size(); i++) {
            if (i % this.rowsPerPage == 0) {
                pageCount++;
            }
            if (pageCount == pageNumber) {
                this.rows.get(i).print();
            }
        }
    }

    public void printTableHTML() {
        System.out.println("<table>");
        System.out.println("<thead>");
        header.printHTML();
        System.out.println("<thead>");
        System.out.println("<body>");
        for (int i = 0; i < this.rows.size(); i++) {
            this.rows.get(i).printHTML();
        }
        System.out.println("</body>");
        System.out.println("</table>");
    }

    public void filter(String x) {
        header.print();
        System.out.println();
        for (int i = 0; i < this.rows.size(); i++) {
            if (this.rows.get(i).doubleText(x)) {
                this.rows.get(i).print();
            }
        }
    }

    public void paginator() {
        int pageCount = 0;
        for (int i = 0; i < this.rows.size(); i++) {
            if (i % this.rowsPerPage == 0) {
                pageCount++;
                System.out.print("| " + pageCount + " ");
            }
        }
    }
}
