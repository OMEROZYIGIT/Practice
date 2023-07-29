package day02_Practice;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
         ****** KAYİT BASARİLİ ******
         Adiniz: Tarık
         Soyadiniz: Yiğit
         Yasiniz: 42
         Mail Adresiniz: tarik@yigit.com
         Sifreniz: A2e365
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen asagidaki bilgileri giriniz!");
        System.out.print("Adiniz: ");
        String name = scanner.nextLine();
        System.out.print("Soyadiniz: ");
        String surname = scanner.nextLine();
        System.out.print("Yasiniz: ");
        int age = scanner.nextInt();
        System.out.println("Mail adresiniz: ");
        String mail = scanner.next();
        System.out.println();
        System.out.println("Sifreniz");
        String password = scanner.nextLine();
        System.out.println();
        System.out.println("****** KAYİT BASARİLİ ******");
        System.out.println("Adiniz: "+name);
        System.out.println("Soyadiniz: "+surname);
        System.out.println("Yasiniz: "+age);
        System.out.println("Mail adresiniz: "+mail);
        System.out.println("Sifreniz: "+password);
        System.out.println("seklinde başarılı şekilde kaydedilmiştir.");

    }
}
