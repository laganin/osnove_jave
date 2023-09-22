package d18_09_2023.Zadatak2;

public class PasswordValidator extends Validator {

    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public PasswordValidator() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private boolean hasUpper(String x) {
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isUpperCase(this.password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasDigit(String x) {
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isDigit(this.password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult x = new ValidationResult();
        if (this.password.contains("#") || this.password.contains("/") || this.password.contains("@") || this.password.contains("*")
                && this.password.length() > 7 && hasUpper(this.password) && hasDigit(this.password)) {

        }
        if (!hasUpper(this.password)) {
            x.addError("Password must contain at least one uppercase letter.");
        }
        if (!hasDigit(this.password)) {
            x.addError("Password must contain at least one digit");
        }
        if (this.password.length() < 7) {
            x.addError("Password must be minimum 8 characters");
        }
        if (!this.password.contains("#") || !this.password.contains("/") || !this.password.contains("@") || !this.password.contains("*"))
        {
            x.addError("Password must contain at least one special character @, # or *");
        }
        return x;
    }
}
