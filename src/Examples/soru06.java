package Examples;

import java.util.Scanner;

public class soru06 {
    /*Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
                Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
                1 şeker = 1.5 gr
                1 kg = 1000 gram olarak hesaplayın
                Ipuclari:
                Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
     */
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("Lutfen günde kaç bardak cay ictiginizi yaziniz: ");
        int cay = scanner1.nextInt();
        Scanner scanner2 =new Scanner(System.in);
        System.out.println("Lutfen caya kac kadar seker kullandıgınızı yaziniz: ");
        double seker = scanner2.nextInt();
        double yillikCay  = cay*30*12;
        System.out.println("Yilda "+ yillikCay+ " bardak cay iciyorsunuz.");
        double yillikSeker = 1.5*seker*30*12/1000;
        System.out.println("Yilda "+ yillikSeker+" kg seker tuketiyorsunuz. ");


    }
}
