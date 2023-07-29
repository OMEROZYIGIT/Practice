package Examples;

import java.util.Scanner;

public class soru16 {
    /*
    Soru 16-)
            Kullanıcıdan 2 isim alın: isim1 ve isim2
                -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
                -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.

Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt..
Örn:
	 isim1= masa
     isim2= ali
	 Konsol => maalisa
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("İsim1'i giriniz: ");
        String isim1 = scanner.nextLine();

        System.out.print("İsim 2'yi giriniz: ");
        String isim2 = scanner.nextLine();

        int uzunluk1 = isim1.length();
        int uzunluk2 = isim2.length();

        if (uzunluk1 % 2 == 0) {
            // İsim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin.
            int ortaIndex = uzunluk1 / 2;
            String yeniIsim = isim1.substring(0, ortaIndex) + isim2 + isim1.substring(ortaIndex);
            System.out.println("Yeni İsim: " + yeniIsim);
        } else {
            // İsim1 tek sayıda karaktere sahipse, işlem yapılamaz.
            System.out.println("isim2, isim1'e eklenemez");
        }

        scanner.close();
    }
}

