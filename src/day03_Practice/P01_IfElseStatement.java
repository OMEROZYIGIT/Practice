package day03_Practice;

import java.util.Scanner;

public class P01_IfElseStatement {
    public static void main(String[] args) {
        /*
        kullanicidan mesafeyi km olarak alin ve cevirmek istedigi birimi
        sorun
        istedigi birimi metre veya santimetre ise cevirip yazdirin
        yoksa
        "istediginiz birim sisteme kayitli degil"
        yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre cinsinden yaziniz: ");
        double km=scan.nextDouble();
        System.out.println("Donusturmek istediginiz birim cinsini yaziniz: ");
        char birim=scan.next().charAt(0);

        if (birim=='m'|| birim=='M') {
            System.out.println("Km olarak yazdiginiz degerin karsiligi: " + km * 1000 + " metre dir.");
        }else if (birim=='s'||birim=='S'||birim=='c'||birim=='C'){
            System.out.println("Km olarak yazdiginiz degerin karsiligi: " + km * 100000 + " cm dir.");
        }else {
            System.out.println("Girdiginiz birim sistemimizde bulunmamamktadir.");
        }
        System.out.println("******************************");
        System.out.println();
        /*
        Ogrencinin notunu harf notuna donusturen bir kod yaziniz
        85-100 --->AA
        85-80 ---->BA
        80-75 ---->BB
        75-65 ---->CB
        65-50 ---->CC
        50-0 ----->FF
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ders notunuzu giriniz: ");
        double not=scanner.nextDouble();
        if (not>100){
            System.out.println("Notunuz 100 den buyuk olamaz.");
        } else if (not>=85 && not<=100) {
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi AA dir." );
        } else if (not>=80 && not<=85) {
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi BA dir." );
        } else if (not>=75 && not<=80) {
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi BB dir." );
        } else if (not>=65 && not<=75) {
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi CB dir." );
        }else if (not>=50 && not<=65){
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi CC dir." );
        }else {
            System.out.println("Girdiginiz notun "+not+ " harf karsiligi CF dir." );
        }

    }
}
