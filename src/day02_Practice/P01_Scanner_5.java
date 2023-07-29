package day02_Practice;

import java.util.Scanner;

public class P01_Scanner_5 {
    public static void main(String[] args) {
        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Değişken için 2 dat Sayı Giriniz");
        System.out.print("Sayı 1 :");
        int sayi1 = scan.nextInt();
        System.out.print("Sayı 2 :");
        int sayi2 = scan.nextInt();
        System.out.println("Girdiğiniz 1. Sayı :" + sayi1+" dir"+"\nGirdiğiniz 2. Sayı :"+sayi2+" dır");
        System.out.println("---------- Hokus Pukus ----------");
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("Degisen Sayi 1 : "+sayi1);
        System.out.println("Degisen Sayi 2 : "+sayi2);
    }
}
