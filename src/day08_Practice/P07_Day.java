package day08_Practice;

// Soru: Java'da tarih ve saat bilgisini temsil etmek için hangi sınıflar kullanılır?
// Verilen bir örnekle tarih ve saat bilgisini nasıl elde edebileceğinizi gösteriniz.

import java.time.LocalDateTime;

public class P07_Day {
    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Şu an ki saat: "+currentTime);  // 2023-08-14T01:20:07.059174600

    }
}
