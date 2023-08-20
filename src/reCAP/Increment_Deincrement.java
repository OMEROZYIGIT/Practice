package reCAP;

import java.util.Scanner;

public class Increment_Deincrement {
    public static void main(String[] args) {

      /*
      Bir sayısal değeri arttırmak/azaltmak istediğimizde şu yöntemler kullanılır
      sayi variableî tanımlanmış olsun

      */
        int sayi = 100;
        sayi++; //sayi değeri 1 arttırılır
        System.out.println(sayi);       // 101
        sayi += 1; //sayı değeri bir arttırırılr
        System.out.println(sayi);       // 102
        sayi += 98; //sayı değeri eşitliğin sağındaki değer kadar arttırılır
        System.out.println(sayi);      // 200
        sayi--; //sayı değeri 1 azaltılır
        System.out.println(sayi);      // 199
        sayi -= 1;//sayı değeri 1 azaltılır
        System.out.println(sayi);      // 198
        sayi -= 98; //sayı değeri eşitliğin sağındaki değer kadar azaltılır
        System.out.println(sayi);      // 100

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bölünecek sayıyı giriniz: ");
        int bolunen = scan.nextInt();
        System.out.print("Lütfen böleceğiniz sayıyı giriniz: ");
        int bolen = scan.nextInt();
        int sayac = 0;

        while (bolunen >= bolen) {
            bolunen -= bolen;
            sayac++;
        }
        System.out.println("Kalan Sayı: " + bolunen);
        System.out.println("Bölüm :" + sayac);

    }
}
