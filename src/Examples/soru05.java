package Examples;

import java.util.Scanner;

public class soru05 {
    /*
    Soru 5-)   SCANNER
            Kullanıcıdan karenin kenar uzunluğunu alın.
            Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu girin: ");
        double kenar = scanner.nextDouble();
        double cevre = kenar*4;
        double alan = kenar*kenar;
        System.out.println(alan);



    }
}
