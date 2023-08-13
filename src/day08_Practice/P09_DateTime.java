package day08_Practice;

// Belirli bir tarih girip o günden bugüne geçen zamanı gün saat dakika saniye olarak yazdırın
// yaş hesaplamada kullanılabilir.

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class P09_DateTime {
    public static void main(String[] args) {

        LocalDateTime startDate = LocalDateTime.of(2022,9,3,20,00);
        LocalDateTime currentDate = LocalDateTime.now();

        Duration duration = Duration.between(startDate,currentDate);

        long day = duration.toDays();
        long hour = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();

        System.out.println("Evliliğimizde bugün: "+day+".gün "+hour+".saat "+minutes+".dakika "+seconds+".saniye");

    }
}
