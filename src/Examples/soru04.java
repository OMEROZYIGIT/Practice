package Examples;

import java.util.Scanner;

public class soru04 {
    /*
    Soru 4-)   SCANNER
            Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int islem=(sayi*sayi*sayi)/2;
        System.out.println(islem);

    }
}
