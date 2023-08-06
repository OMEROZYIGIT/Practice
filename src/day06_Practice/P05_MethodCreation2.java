package day06_Practice;

import java.util.Scanner;

public class P05_MethodCreation2 {
    /*
   Kullanicidan main method icinde ayri ayri isim ve soyismini alin
   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
   isim bosluk soyisim seklinde bize donduren bir method olusturun
    */

    public static void main(String[] args) {

        // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String name= scan.nextLine();                   //next yazılırsa ilk boşluğua kadar alı. nextLine yazılırsa satırı alır.
        System.out.print("Lütfen Soyadınızı giriniz: ");
        String surname= scan.nextLine();

        // method u kulllanalım
        System.out.println(isimSoyisimYazdir(name,surname));

    }

    private static String isimSoyisimYazdir(String name, String surname) {

        // Isim ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        // soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();

        String duzenliIsim=name+" "+surname;
        return duzenliIsim;
    }
}

