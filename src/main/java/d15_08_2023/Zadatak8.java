package d15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

//Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
//Svaka komponenta boje je u opsegu od 0 do 255(informativno)
//Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
//Primer izvrsenja:
//Originalna boja: RGB(140, 12,  100)
//Kontrastna boja: RGB(115, 243, 155)

        int r = 0, g = 0, b = 0;
        int opseg = 255;

        r = 155;
        g = 107;
        b = 55;

        int kontrastR = opseg - r;
        int kontrastG = opseg - g;
        int kontrastB = opseg - b;

        System.out.println("Originalna boja: RGB(" + r + ", " + g + ", " + b + ")");
        System.out.println("Kontrastna boja: RGB(" + kontrastR + ", " + kontrastG + ", " + kontrastB + ")");


    }
}
