package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//Primer 1:                                              Primer 2:
//Unestite a: 6                                        Unestite a: 6
//Unesite b: 3                                         Unesite b: 3
//Unesite operator: +                             Unesite operator: /
//Rezultat: 9                                           Rezultat: 2

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Uneti operator: +, - , * ili / ");
        String operator = s.next();

        if(operator.equals("+")){
            int rezultat = a + b;
            System.out.println("Rezultat: "+ rezultat);
        }

        if(operator.equals("-")){
            int rezultat = a - b;
            System.out.println("Rezultat: "+ rezultat);
        }

        if(operator.equals("*")){
            int rezultat = a * b;
            System.out.println("Rezultat: "+ rezultat);
        }

        if(operator.equals("/")){
            int rezultat = a / b;
            System.out.println("Rezultat: "+ rezultat);
        }
    }
}
