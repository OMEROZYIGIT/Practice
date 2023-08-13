package day08_Practice;


// Soru: Java'da tarih ve saat bilgisini belirli bir formatta nasıl biçimlendirirsiniz?
// Verilen bir örnekle tarih ve saati farklı biçimlerde nasıl gösterebileceğinizi açıklayınız.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P08_DateFormater {
    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");

        String newFormartDateTime = currentTime.format(formatter);

        System.out.println("Yeni Zaman Biçimi: "+newFormartDateTime);

    }
}
