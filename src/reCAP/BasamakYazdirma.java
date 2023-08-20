package reCAP;

import java.util.Scanner;

public class BasamakYazdirma {
        /*
        Kullanıcıdan 3 basamaklı bir sayı girmesini isteyin
        Daha sonra bu sayının sırasıyla
        Birler Basmağı:
        Onlar Basamağı:
        Yüzler Basamağı:
        basamaklarını yazdırınız.
         */

    public static void main(String[] args) {

            Scanner ahmet=new Scanner(System.in);
            System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
            int sayi= ahmet.nextInt();

            int birlerbas=sayi%10;
            sayi/=10;
            int onlarbas=sayi%10;
            sayi/=10;
            //int yuzlerbasamagi=sayi;
            int yuzlerbas=sayi%10;

            int enYakinYuzluk=sayi*100;

            System.out.println("Birler Basamağı: "+birlerbas+"\nOnlar Basamağı: "+onlarbas+"\nYüzler Basamağı: "+yuzlerbas);

    }
}
