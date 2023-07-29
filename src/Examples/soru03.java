package Examples;

import java.util.Scanner;

public class soru03 {
    /*
    Soru 3-)   SCANNER
                Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

     */
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz: ");
        double sayi1=scanner1.nextDouble();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        double sayi2=scanner2.nextDouble();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Lutfen 3. sayiyi giriniz: ");
        double sayi3=scanner3.nextDouble();
        Scanner scanner4=new Scanner(System.in);
        System.out.println("Lutfen 4. sayiyi giriniz: ");
        double sayi4=scanner4.nextDouble();
        Scanner scanner5=new Scanner(System.in);
        System.out.println("Lutfen 5. sayiyi giriniz: ");
        double sayi5=scanner5.nextDouble();
        double sayiOrtalamasi = (sayi1+sayi2+sayi3+sayi4+sayi5) /5;
        System.out.println(sayiOrtalamasi);

        }

    }

