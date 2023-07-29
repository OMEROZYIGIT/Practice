package Examples;

import java.util.Scanner;

public class soru11 {
    /*
    Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır.
                Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz.
                Giriş :
		                > Gandalf Grey 563245879632
                Çıktı :
		                > İsim : G****** G***
		                > CCN : **** **** 9632
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = scanner.next();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = scanner.next();

        System.out.print("Kredi kartı numaranızı giriniz: ");
        String kartNumarasi = scanner.next();

        // Ad ve soyadın baş harflerini büyük yap
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();

        // Kredi kartı numarasının 16 haneli olup olmadığını kontrol et
        if (kartNumarasi.length() != 16) {
            System.out.println("Geçersiz kredi kartı numarası");
        } else {
            // Kredi kartı numarasını özel formata dönüştür
            String gizliKartNumarasi = "**** **** **** " + kartNumarasi.substring(12);

            // Sonuçları yazdır
            System.out.println("İsim: " + ad.charAt(0) + "****** " + soyad.charAt(0) + "***");
            System.out.println("CCN: " + gizliKartNumarasi);
        }
        scanner.close();
    }
}
