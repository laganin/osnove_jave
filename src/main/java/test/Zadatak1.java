package test;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int rezultat = 0;

        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca.");
        int minVisina = s.nextInt();
        int maxVisina = s.nextInt();
        String grad = s.next();
        int minStarost = s.nextInt();
        int maxStarost = s.nextInt();
        String bojaKose = s.next();
        boolean brada = s.nextBoolean();

        System.out.println("Unesite karakteristike muškarca: ");
        int visina = s.nextInt();
        String mesto = s.next();
        int godine = s.nextInt();
        String bojaKoseRealna = s.next();
        boolean imaBradu = s.nextBoolean();

        if (minVisina<visina & visina<maxVisina)
        {rezultat++;}

        if (grad.equals(mesto))
        {rezultat++;}

        if (minStarost<godine & godine<maxStarost)
        {rezultat++;}

        if (bojaKoseRealna.equals(bojaKose))
        {rezultat++;}

        if (imaBradu == brada)
        {rezultat++;}

        if (rezultat>=3){
            System.out.println("Pronašli ste svog idealnog muškarca!");
        }
        else System.out.println("Muškarac ne ispunjava vaše zahteve.");
    }
}
