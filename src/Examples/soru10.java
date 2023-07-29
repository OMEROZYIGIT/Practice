package Examples;

import java.util.Scanner;

public class soru10 {
    /*
    Soru 10-)  Klasik Soru :
    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
    // If konusunu hatırlayın!***
    Kullanıcıya aşağıdaki gibi mesaj verin:
    Eğer VKİ 18.5'ten az ise --> zayıfsınız
    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
    VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!

    ÖRNEK :
    Ağırlık : 71
    Yükseklik : 1,72

    ÇIKTI :
    VKİ değeriniz : 23.99945916711736 -> Kilonuz ideal
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu metre olarak giriniz: ");
        double boy = scanner.nextDouble();

        double vke = kilo*10000 / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vke);

        if (vke < 18.5) {
            System.out.println("zayıfsınız");
        } else if (vke >= 18.5 || vke < 25) {
            System.out.println("kilo idealdir");
        }else if (vke>=25 || vke<30){
            System.out.println("şişmansınız");
        }else if (vke>=30){
            System.out.println("agam obezsin, diyet yap!");
        }
    }
}

