package d07_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

//Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Product food = new Product();
        Product drink = new Product();
        Product cleaningSupplies = new Product();

        food.name = "Pasteta";
        food.price = 99.99;

        drink.name = "Coca-Cola";
        drink.price = 149.99;

        cleaningSupplies.name = "Ariel";
        cleaningSupplies.price = 328.55;

        System.out.println(cleaningSupplies.name + ", " + cleaningSupplies.price);
        System.out.println(drink.name + ", " + drink.price);
        System.out.println(food.name + ", " + food.price);


    }
}
