package Examples;

import java.util.Scanner;

public class soru14 {
    /*
    Soru 14-)
                Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
                ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
                    Örnek:
                            char ch1='a'
                            String name ="Ali bakkala geç gitti."
                            Beklenen Çıktı= a sayısı = 3
                      Ipucu:
                      Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
                      Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String isim = scanner.nextLine();
        System.out.print("Karakteri giriniz: ");
        char karakter = scanner.next().charAt(0);

        int tekrarSayisi = 0;

        // İsimdeki her karakteri kontrol et
        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i) == karakter) {
                tekrarSayisi++;
            }
        }
        System.out.println("Girilen karakterin tekrar sayısı: " + tekrarSayisi);
        scanner.close();

    }
}
