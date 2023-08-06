package day05_Practice;

import java.util.Scanner;

public class P06_CokDahaBasit_forLoop {
    /*

    kullanıcıdan başlangıç ve bitiş değeri pozitif sayılar alın
    sınırlar dahil olarak
    aralarındaki tüm sayıların toplamını yazdırın
    bitiş değeri başlangıç değerinden küçükse, uyarı yazdırıp işlemi sonlandırın

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen başlangıç sayısını giriniz : ");
        int basSayi = scanner.nextInt();

        System.out.println("Lutfen bitiş sayısını giriniz : ");
        int sonSayi = scanner.nextInt();

        int toplam = 0;

        for (int i = basSayi; i <= sonSayi ; i++) {
            toplam += i;
        }if (basSayi>sonSayi){
            System.out.println("Lutfen basSayi sonSayi dan büyük sayi yazınız");
        }
        System.out.println(toplam);
    }
}
