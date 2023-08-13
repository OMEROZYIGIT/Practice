package day08_Practice;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class P07_Day01 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023,8,12);
        LocalDate futureDate = calculateFutureDate(startDate,120);
        System.out.println("120 gün sonrası: "+futureDate);

    }
    static LocalDate calculateFutureDate (LocalDate startDate, long addDay){

        return startDate.plus(addDay, ChronoUnit.DAYS);

    }
}
