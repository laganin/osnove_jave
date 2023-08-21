package p21_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        
//Napisati program koji od brojeva od 1 do 10 formira string koji ima spoj svih brojeva.
//Primer izvrsenja:
//String je 12345678910        
        
        String string= ("");

        for (int i = 1; i <11; i++) {
            string = string + i;
        }
        System.out.println("String je " + string);
    }
}
