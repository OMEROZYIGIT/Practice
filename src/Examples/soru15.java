package Examples;

import java.util.Scanner;

public class soru15 {
    /*
    Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
                Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                               Loopun içerisinde StringM methodlarından  yararlanalım!
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("En az 5 harfli bir kelime giriniz: ");
        String kelime = scanner.next();

        // Girilen kelimenin uzunluğunu kontrol et
        if (kelime.length() < 5) {
            System.out.println("En az 5 harfli bir kelime giriniz.");
            scanner.close();
            return;
        }

        // Son 3 harfi al
        String sonUcHarf = kelime.substring(kelime.length() - 3);

        // Son 3 harfin iki kopyasını oluştur
        String yeniKelime = sonUcHarf + sonUcHarf;

        System.out.println("Oluşturulan yeni kelime: " + yeniKelime);

        scanner.close();
    }
}
