package d18_09_2023.Zadatak2;

public class EmailValidator extends Validator {

    private String email;

    public EmailValidator() {
    }

    public EmailValidator(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult x = new ValidationResult();
        if (this.email.endsWith(".com") || this.email.endsWith(".net") && this.email.contains("@")) {} else x.addError("Email is invalid");
        return x;
    }
}

