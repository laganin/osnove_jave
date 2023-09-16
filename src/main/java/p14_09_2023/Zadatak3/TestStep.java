package p14_09_2023.Zadatak3;

public class TestStep {

    private String opis;
    private String actualVrednost;
    private String expectedVrednost;
    private String errorMessage;

    public TestStep(String opis, String actualVrednost, String expectedVrednost, String errorMessage) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectedVrednost = expectedVrednost;
        this.errorMessage = errorMessage;
    }

    public boolean validate() {
        return this.actualVrednost == this.expectedVrednost;
    }

    public void print() {
        System.out.println("| " + this.opis + " |");
        System.out.print("| Status ");
        if (this.validate() == true) {
            System.out.println("passed");
        } else System.out.println("failed | " + this.errorMessage);
    }

    public String getOpis() {
        return opis;
    }

    public String getActualVrednost() {
        return actualVrednost;
    }

    public String getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
