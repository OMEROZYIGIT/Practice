package day02_Practice;

import java.util.Scanner;

public class P03_IfStatement {
    public static void main(String[] args) {
        /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar
               output = “Hafta sonu”
               gun=Sali
               output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün: ");
        String gunAdi = scan.next().toLowerCase();
        if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println("Bugünü -" + gunAdi + "- olarak  girdiniz");
            System.out.println("Bugün Hafta Sonu");
        }
        if (gunAdi.equals("pazartesi") || gunAdi.equals("salı") || gunAdi.equals("çarşamba") || gunAdi.equals("perşembe") || gunAdi.equals("cuma")) {
            System.out.println("Bugünü -" + gunAdi + "- olarak  girdiniz");
            System.out.println("Bugün Hafta içi");
        }
        if (!(gunAdi.equals("pazartesi") || gunAdi.equals("salı") || gunAdi.equals("çarşamba") || gunAdi.equals("perşembe") || gunAdi.equals("cuma") || gunAdi.equals("cumartesi") || gunAdi.equals("pazar"))) {
            System.out.println("Yanlış giriş yaptınız -" + gunAdi + "- bir gün ismi değildir");
        }
    }
}




