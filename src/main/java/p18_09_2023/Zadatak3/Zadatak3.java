package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class Zadatak3 {
//    Kreirati abstraktnu klasu Figura koja ima
//    abstraktnu metodu povrsina
//    abstraktnu metodu obim
//    metodu koja stampa podatke u formatu:
//    Povrsina je (povrsina)
//    Obim je (obim)
//
//    Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//    stranicu a
//    gettere/settere/konstruktore
//    implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//    implementira metodu obim
//
//    Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//    stranice a i b
//    gettere/settere/konstruktore
//    implementira metodu povrsina
//    implementira metodu obim
//
//    U glavnom programu kreirati niz figura (niz od 3 pravougaonika i 2 trougla). Zatim odstampati na ekranu sve figure i sume njhovih povrsina i obima.

//Kreirati klasu FigureGenerator koja ima:
//Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
//
//U glavnom programu generisati 3 pravougaonika i 2 trougla


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 3);
        Rectangle rectangle2 = new Rectangle(5, 5);
        Rectangle rectangle3 = new Rectangle(5, 6);

        EquilateralTriangle equilateralTriangle1 = new EquilateralTriangle(3);
        EquilateralTriangle equilateralTriangle2 = new EquilateralTriangle(1);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(rectangle3);
        figures.add(equilateralTriangle1);
        figures.add(equilateralTriangle2);

        double areaSum = 0;
        double perimeterSum = 0;
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).print();
            double area = figures.get(i).area();
            double perimeter = figures.get(i).perimeter();
            areaSum = areaSum + area;
            perimeterSum = perimeterSum + perimeter;
        }
        System.out.println("Total area sum is " + areaSum);
        System.out.println("Total area sum is " + perimeterSum);

        FigureGenerator.generate("rectangle");
        FigureGenerator.generate("rectangle");
        FigureGenerator.generate("rectangle");
        FigureGenerator.generate("triangle");
        FigureGenerator.generate("triangle");
    }
}
