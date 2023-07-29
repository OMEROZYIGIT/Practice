package day05_25temmuz;

import java.util.Scanner;

public class C02_25temmuz {
    /*
    2. SORU
        Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
        Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
        Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
        Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.

        //hello ----> ıfmmp --->1 birim kaydırılmış hali

     */
    public static void main(String[] args) {
        System.out.println("Şifrelenmiş metni giriniz: ");
        Scanner scan = new Scanner(System.in);
        String metin = scan.nextLine().toUpperCase();
        System.out.println("Metni kaydırma miktarını giirniz: ");
        int kaydirma = scan.nextInt();

        // method u kullanalım
        sifreleme(metin,kaydirma);
    }

    public static void sifreleme(String metin,int kaydirma){  // method oluşturuldu.
        // şifrenlemiş metni atamak için boş bir String variable yaratıyoruz
        String sifrelenmisMetin = "";

        // kaydırma miktarına göre gezeceği referans olan alfabeyi tanımladık
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // i değerimiz yazılan metnin her harfinde 0. indexten başlayarak ilerler
        for (int i = 0; i < metin.length(); i++) {

            // verilen metnin her karakterini karakter variablenına atar
            char karater = metin.charAt(i);

            // metindeki sırayla harflerin alfade kaçıncı index e denk geldiğini bulur
            int karakterIndex = alfabe.indexOf(karater);

            // bu bulduğu indexten yazilan kaydırma miktarı kadar kaydır ve yeni index i tanımla
            int yeniIndex = (karakterIndex + kaydirma) % alfabe.length();
            //(26       +    3) % 26 =  3
            //karakterIndexin ve kaydırma miktarını ekledikten sonra alfabe uzunluğunu geçmemesi için alfabe
            //uzunluğuna modu alınarak alfabe değerleri içinde yeniIndex değeri elde edilmiş oldu

            // yeni indexteki harfi sırayla şifrelenmiş metne yazdırır.
            sifrelenmisMetin += alfabe.charAt(yeniIndex);
        }
        // yapılan işlemlerin sonunda küçük harfe döndür ve yazdır
        System.out.println("Şifrelenmiş metin: " + sifrelenmisMetin.toLowerCase());
    }
}
