package Examples;

import java.util.Scanner;

public class soru08 {
    /*
    Soru-8)  Kullanicidan üc basamaklı bir sayı alin.

    Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
    ipuclari:
    Matematiksel Islemler konusuna bakalim.
    Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi%10;
        rakamlarToplami += birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi = girilenSayi%10;
        rakamlarToplami += birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi = girilenSayi%10;
        rakamlarToplami += birlerBasamagi;
        girilenSayi=girilenSayi/10;

        System.out.println(rakamlarToplami);

    }
}
