package day02_Practice;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Değişken için 2 dat Sayı Giriniz");
        System.out.print("Sayı 1 :");
        int sayi1 = scan.nextInt();
        System.out.print("Sayı 2 :");
        int sayi2 = scan.nextInt();
        System.out.println("Girdiğiniz 1. Sayı :" + (double)sayi1+" dir"+"\nGirdiğiniz 2. Sayı :"+(double)sayi2+" dır");
        System.out.println("---------- Hokus Pukus ----------");
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("Degisen Sayi 1 : "+(double)sayi1);
        System.out.println("Degisen Sayi 2 : "+(double)sayi2);*/

        /*
        1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
        ipucu: double>float>long>int>short>byte
         */

        int a = 2;
        int b = 3;
        int c = 4;

        long d = a+b+c;
        System.out.println("d = " + d);//soutv
        double e = a+b;
        System.out.println("e = " + e);
        System.out.println(d);
        System.out.println(e);
        System.out.println("e = " + e);


        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();
        isim =isim.toUpperCase();
/*
        2- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
         */
        Scanner murat=new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz:");
        double sayi1= murat.nextDouble();
        double sayi2=murat.nextDouble();
        int sonuc=(int)(sayi1/sayi2);
        System.out.println("sonuc = " + sonuc);

    }
}
