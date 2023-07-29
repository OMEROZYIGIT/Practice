package Examples;

import java.util.Scanner;

public class soru09 {
    /*
    Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen saniyeye cevirmek istediğiniz zamanı saat,dk,saniye olarak giriniz: ");
        int saat = scanner.nextInt();
        int dakika = scanner.nextInt();
        int saniye = scanner.nextInt();

        int toplamSaniye =0;

        // Saati saniyeye çevir (1 saat = 3600 saniye)
        toplamSaniye += saat * 3600;

        // Dakikayı saniyeye çevir (1 dakika = 60 saniye)
        toplamSaniye += dakika * 60;

        // Saniyeleri ekle
        toplamSaniye += saniye;

        System.out.println(toplamSaniye);

    }
}
