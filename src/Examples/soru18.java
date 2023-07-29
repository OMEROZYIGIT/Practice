package Examples;

import java.util.Scanner;

public class soru18 {
    /*
    Soru 18-) Method Sorusu
            Girilen araç hızı ve yol kilometresinden,
            gidilen yere varış süresini hesaplayan bir method yazalım.
            Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman

     */
    public static void main(String[] args) {

       varisSuresi(50,400);


    }
    public static void varisSuresi(int hız, int km){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arac hizini giriniz: ");
        int hiz = scanner.nextInt();
        System.out.println("Lutfen kalan yol kmsini giriniz: ");
        int yol =scanner.nextInt();

        int  sure = yol/hız;
        System.out.println(sure);
        return;
    }
    public static double hesaplaVarisSuresi (double hiz, double yol){


        return yol/hiz;
    }
}

