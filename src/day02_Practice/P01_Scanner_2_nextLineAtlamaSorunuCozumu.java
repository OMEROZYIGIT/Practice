package day02_Practice;

import java.util.Scanner;

public class P01_Scanner_2_nextLineAtlamaSorunuCozumu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Adınızı Soyadınız: ");
            String name = scanner.nextLine();

            System.out.print("Yaşınız: ");
            int age = scanner.nextInt();

            //scanner.nextInt() ile değer aldıktan sonra  scanner.nextLine(); ile değer istenirse sorun çıkıyor.
            // Atlama problemi oluşuyor
            // Sorunu çözmek için alttaki satır ekleniyor. Alttaki satırı yoruma alarak çalıştırıp sorunu görebilirsiniz
           scanner.nextLine();
           //Bu satırsonu arabellekte kalan karakteri kullanalım.

            System.out.println("Mesleğiniz nedir?: ");
            String job = scanner.nextLine();

            System.out.println("Güzel bir meslek: "+ job);

            // scannerdan bir değer almayacam demek
            scanner.close();
        }
    }

