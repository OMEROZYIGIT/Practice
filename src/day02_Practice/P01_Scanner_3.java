package day02_Practice;

import java.util.Scanner;

public class P01_Scanner_3 {
    public static void main(String[] args) {

        /*
        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        üçgenin alanını hesaplayıp yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen alan hesaplanacak ucgenin ilgili degerlerini giriniz");
        System.out.println();
        System.out.println("kenar uzunlugunu giriniz: ");
        double kenar = scanner.nextDouble();
        System.out.println("Ucgenin yüksekliğini giriniz: ");
        double yukseklik = scanner.nextDouble();
        System.out.println("--------Bilgileri girilen ücgenin alani-------");
        System.out.println("UCGENİN ALANI: \n" +(kenar*yukseklik)/2 );

    }
}
