package day02_Practice;

import java.util.Scanner;

public class P03_IfStatement_1 {
    public static void main(String[] args) {
        /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu
    vizeler %40
    final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adınızı giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Lutfen soyadınızı giriniz: ");
        String surname = scanner.nextLine();
        System.out.println("---Lutfen vize ve final notunus sırayla giriniz---");
        System.out.println("1.Vize Notu: ");
        double vize1= scanner.nextDouble();
        System.out.println("2.Vize Notu: ");
        double vize2= scanner.nextDouble();
        System.out.println("Final Notu: ");
        double finalnotu= scanner.nextDouble();
        double yilSonuNotu=(((vize1+vize2)/2*0.4)+(finalnotu*0.6));
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname);
        System.out.println("1. Vize Notu: "+vize1);
        System.out.println("2. Vize Notu: "+vize2);
        System.out.println("Final Notu: "+finalnotu);
        System.out.println("Yıl Sonu Notu = " + yilSonuNotu);

        if (yilSonuNotu>=50) {
            System.out.println("Der Durumu: GEÇTİNİZ TEBRİKLER");
        }
        if (yilSonuNotu< 50) {
            System.out.println("Ders Durumu: MAALESEF KALDINIZ");
        }

    }
}
