package reCAP;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan double 2 sayı alıp iki sayıyı birbirine böldürüp sonucu tam sayı olarak yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir ondalıklı sayı giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.print("Lütfen bir tane daha ondalıklı sayı giriniz: ");
        double sayi2= scan.nextDouble();

        double sonuc=sayi1/sayi2;
        System.out.println("Giridiniz sayıların bölümü: "+(int)sonuc);

        int sonuc1=(int)(sayi1/sayi2);
        System.out.println("Giridiniz sayıların bölümü: "+sonuc1);

    }
}