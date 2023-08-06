package day06_Practice;

import java.util.Scanner;

public class P04_MethodCreation {
    /*
     Kullanicidan main method icinde pozitif bir tamsayi alin.
     Girilen sayinin asal sayi olup olmadigini kontrol edip
     sonuc olarak “asal sayi” veya “asal sayi degil”
     sonuclarini donduren bir method olusturun.
   */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
        int sayi= scan.nextInt();

        // methodu u kullanalim
        System.out.println(asalSayiKontrol(sayi));

    }

    private static String asalSayiKontrol(int sayi) {

        String sonuc="sayı asal sayıdır";

        // sayi 2 den başlayıp sayiya kadar git
        for (int i = 2; i <sayi ; i++) {
            // eğer sayi başladığı değerden sayiya kadar giderken herhangi bir değerde kendini bölebilen bir sayı bulursa asal sayı değildir.
            if (sayi%i==0){
                sonuc="sayı asal sayı değildir";
            }
        }
        return sonuc;
    }
}

