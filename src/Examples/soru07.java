package Examples;

import java.util.Scanner;

public class soru07 {
    /*
    Soru 7-)  Kullanicidan Double türünde bir sayi alin.
              Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
              (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        ( Data Casting -> Auto Widening ve Explicit Narrowing )
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen double bir sayi giriniz: ");
        double sayi = scanner.nextDouble();
        int sayi1 = (int)sayi;
        System.out.println(sayi1);

    }
}

