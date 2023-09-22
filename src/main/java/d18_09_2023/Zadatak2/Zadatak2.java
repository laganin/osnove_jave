package d18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

        Validator email1 = new EmailValidator("peraperic");
        Validator email2 = new EmailValidator("milan@gmail.net");
        Validator password = new PasswordValidator("ITbootcamp");
        Validator phone = new PhoneValidator("55555a55");


        email1.validate().print();
        email2.validate().print();
        password.validate().print();
        phone.validate().print();

    }
}
