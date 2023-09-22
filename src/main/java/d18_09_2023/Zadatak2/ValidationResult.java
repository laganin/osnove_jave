package d18_09_2023.Zadatak2;

import java.util.ArrayList;

public class ValidationResult {

    private boolean hasErrors;
    private ArrayList<String> errors;

    public ValidationResult() {
        this.hasErrors = false;
        this.errors = new ArrayList<>();
    }

    public ValidationResult(boolean hasErrors) {
        this.hasErrors = hasErrors;
        this.errors = new ArrayList<>();
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    public void addError(String x) {
        this.hasErrors = true;
        this.errors.add(x);
    }

    public void print() {
        if (this.hasErrors) {
            for (int i = 0; i < this.errors.size(); i++) {
                System.out.println(this.errors.get(i));
            }
        } else
            System.out.println("No validation errors");
    }
}
