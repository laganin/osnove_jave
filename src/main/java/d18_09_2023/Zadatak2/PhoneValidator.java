package d18_09_2023.Zadatak2;

public class PhoneValidator extends Validator {

    private String number;

    public PhoneValidator() {
    }

    public PhoneValidator(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private boolean notDigit(String x) {
        for (int i = 0; i < this.number.length(); i++) {
            if (!Character.isDigit(this.number.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult x = new ValidationResult();
        if (this.number.startsWith("+") && !this.number.contains(" ") && !notDigit(this.number)) {
        }
        if (!this.number.startsWith("+")) {
            x.addError("Phone number must start with +");
        }
        if (this.number.contains(" ")) {
            x.addError("Phone number cannot contain spaces");
        }
        if (notDigit(this.number)) {
            x.addError("Phone number can only contain numbers");
        }
        return x;
    }
}
