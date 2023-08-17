package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan. Ukoliko broj nije validan, ispisuje se greska za svaki broj.
//Broj nije validan ukoliko je broj negativan.
//
//Primer izvrsenja 1:
//Unesite a: 10
//Unesite b: -22
//Unesite c: -4
//Unet broj B=-22 nije validan
//Unet broj C=-4 nije validan
//
//Primer izvrsenja 2:
//Unesite a: -10
//Unesite b: 22
//Unesite c: -4
//Unet broj A=-10 nije validan
//Unet broj C=-4 nije validan
//
//Primer izvrsenja 3:
//Unesite a: -10
//Unesite b: 22
//Unesite c: 4
//Unet broj A=-10 nije validan

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        if (a >= 0) {
            System.out.println("Unet broj A = " + a + " je validan");
        }

        if (a<0){
            System.out.println("Unet broj A = " + a + "  nije validan");
        }


        System.out.print("Unesite b: ");
        int b = s.nextInt();

            if (b >= 0) {
                System.out.println("Unet broj B = " + b + " je validan");
            }

                if (b<0) {
                    System.out.println("Unet broj B = " + b + "  nije validan");
                }

                    System.out.print("Unesite c: ");
                    int c = s.nextInt();

                    if (c >= 0) {
                        System.out.println("Unet broj C = " + c + " je validan");
                    }

                        if (c < 0) {
                            System.out.println("Unet broj C = " + c + "  nije validan");


                        }

                }}
